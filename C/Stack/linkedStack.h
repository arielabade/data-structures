#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

#ifndef STACK_ENC
#define STACK_ENC

typedef int ITEM;

typedef struct node
{
    ITEM item;
    struct node *next;
} NODE;

typedef struct
{
    NODE *top;
    long size;
} STACK;

char compare(ITEM x, ITEM y);

bool equal(ITEM x, ITEM y);

void initialize(STACK *s);

long size(STACK *s);

bool full(STACK *s);

bool empty(STACK *s);

bool push(ITEM item, STACK *s);

bool topItem(ITEM *item, STACK *s);

bool pop(ITEM *item, STACK *s);

ITEM nth(long n, STACK *s);

void displayItem(ITEM i);

void display(STACK *s);

void clear(STACK *s);

void destroy(STACK *s);

#endif // STACK_ENC
