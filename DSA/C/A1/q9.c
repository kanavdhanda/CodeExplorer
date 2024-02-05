#include <stdio.h>
int main(){
    float princ , amount , interest , time , rate;
    printf("Enter the principal amount: ");
    scanf("%f", &princ);
    printf("Enter Time: ");
    scanf("%f", &time);
    printf("Enter the rate %: ");
    scanf("%f", &rate);
    interest = ((princ * time * rate)/100);
    amount = princ + interest ; 
    printf("The amount will be : %.3f", amount);
    return 0;
}