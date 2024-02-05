#include <stdio.h>
#include <math.h>
int main(){
    double time , rate , amount , princ , interest;
    printf("Enter the principal amount: ");
    scanf("%lf", &princ);
    printf("Enter time duration: ");
    scanf("%lf", &time);
    printf("Enter rate %: ");
    scanf("%lf", &rate);
    amount = princ*(pow((1+rate/100), time));
    printf("The interest will be %f", amount-princ);
    printf("The amount will be %f", amount);
    return 0;
}