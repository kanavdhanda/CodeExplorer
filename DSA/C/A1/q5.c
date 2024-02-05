#include <stdio.h>
int main(){
    int num , dum;
    float dec;
    printf("Enter the Numerator: ");
    scanf("%d", &num);
    printf("Enter the Denominator: ");
    scanf("%d", &dum);
    dec = ((float)num)/((float)dum);
    printf("In decimal format the number is: %f \n", dec);
    printf("In fractional format the number is %d/%d", num , dum);
    return 0;
}