#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

#include "PilhaEnc.h"

char compare(ITEM x, ITEM y)
{
    return x > y ? 1 : (x < y ? -1 : 0);
}

bool equal(ITEM x, ITEM y)
{
    return compare(x, y) == 0;
}

void initialize(PILHA *p)
{
    p->top = NULL;
    p->size = 0;
}

NO *createNode(ITEM item, NO *next)
{
    NO *newNode = (NO *)malloc(sizeof(NO));
    newNode->item = item;
    newNode->next = next;
    return newNode;
}

long size(PILHA *p)
{
    return p->size;
}

bool full(PILHA *p)
{
    return false;
}

bool empty(PILHA *p)
{
    return p->top == NULL;
}

bool push(ITEM item, PILHA *p)
{
    NO *newNode = (NO *)malloc(sizeof(NO));
    newNode->item = item;
    newNode->next = p->top;
    p->top = newNode;
    p->size++;
    return true;
}

bool top(ITEM *item, PILHA *p)
{
    if (empty(p))
        return false;

    *item = p->top->item;
    return true;
}

bool pop(ITEM *item, PILHA *p)
{
    if (empty(p))
        return false;

    NO *toPop = p->top;
    *item = toPop->item;
    p->top = toPop->next;
    p->size--;
    free(toPop);
    return true;
}

NO *nodeAtPosition(long n, PILHA *p)
{
    if (n < 0 || n >= size(p))
        return NULL;

    NO *current = p->top;
    for (long i = 0; i < n; i++)
        current = current->next;
    return current;
}

ITEM nthElement(long n, PILHA *p)
{
    NO *node = nodeAtPosition(n, p);
    if (node)
        return node->item;
    else
    {
        printf("Position does not exist in the stack (%ld)\n", n);
        exit(EXIT_FAILURE);
    }
}

void displayItem(ITEM i)
{
    printf("%d", i);
}

void display(PILHA *p)
{
    printf("[");
    NO *current = p->top;
    while (current)
    {
        displayItem(current->item);
        if (current->next)
            printf(",");
        current = current->next;
    }
    printf("]");
}

void clear(PILHA *p)
{
    NO *current = p->top;
    while (current != NULL)
    {
        NO *next = current->next;
        free(current);
        current = next;
    }
    p->top = NULL;
    p->size = 0;
}

void destroy(PILHA *p)
{
    clear(p);
}