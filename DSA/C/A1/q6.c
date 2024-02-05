#include <stdio.h>
int main(){
    int a ,b;
    printf("Enter the first number: ");
    scanf("%d", &a);
    printf("Enter the second number:");
    scanf("%d", &b);
    printf("Result of addition of %d and %d is %d", a , b , a+b);
    printf("\nResult of subtraction of %d and %d is %d", a , b , a-b);
    printf("\nResult of multiplication of %d and %d is %d", a , b , a*b);
    printf("\nResult of division of %d and %d is %.2f", a , b , (((float)a)/((float)b)));
    return 0;
}