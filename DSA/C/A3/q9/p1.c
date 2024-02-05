#include <stdio.h>
int main(){
    int num, fact;
    fact=1;
    printf("Enter number: ");
    scanf("%d", &num);
    for(int i=1;i<=num;i++){
        fact= fact * i;
    }
    printf("Factorial of number %d is %d", num , fact );
    return 0;
}