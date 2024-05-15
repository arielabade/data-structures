#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "LinkedStack.h"

void printStatus(STACK *s);
void testPush(STACK *s);
void testAccess(STACK *stack);
void testPop(STACK *s);

int main() {
    STACK s;
    initialize(&s);
    
    testPush(&s);
    testAccess(&s);
    testPop(&s);

    destroy(&s);
    printStatus(&s);
        
    getchar();
    return 0;
}

void printStatus(STACK *s) {
    printf("Stack Size: %ld\n", size(s));
    display(s);
    printf("\n");
}

void testPush(STACK *s) {
    printf("=> Push Test\n");
    long count;
    printf("How many items do you want to push onto the stack? ");
    scanf("%ld", &count);

    ITEM item;
    for (long i = 1; i <= count; i++) {
        printf("Enter value %ld: ", i);
        scanf("%d", &item);
        push(item, s);
    }

    printStatus(s);
}

void testAccess(STACK *stack) {
    printf("=> Access Test\n");
    printf("Enter the position you want to access (or -1 to exit): ");
    long position;
    scanf("%ld", &position);
    while (position != -1) {
        ITEM item = nth(position, stack);
        printf("Value at position %ld: %d\n", position, item);
        printf("Enter position (or -1 to exit): ");
        scanf("%ld", &position);
    }
}

void testPop(STACK *s) {
    printf("=> Pop Test\n");
    
    if (empty(s)) {
        printf("Stack is empty.\n");
        return;
    } else {
        printf("Stack has %ld values\n", size(s));
    } 
    
    ITEM item;
    while (!empty(s)) {
        if (pop(&item, s))
           printf("Popped value: %d\n", item);
        else
           printf("Error popping.\n");

        printStatus(s);
    }
}
