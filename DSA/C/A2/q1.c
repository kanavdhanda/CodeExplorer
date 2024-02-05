#include <stdio.h>
#include <math.h>
int main(){
    float val, power;
    printf("Enter value here: ");
    scanf("%f", &val);
    printf("Enter the power: ");
    scanf("%f", &power);
    printf("sin of the value %.2f is %.2f", val , sin(val));
    printf("\ncos of the value %.2f is %.2f", val , cos(val));
    printf("\nlog 2 of the value %.2f is %.2f", val , log2(val));
    printf("\nlog 10 of the value %.2f is %.2f", val , log10(val));
    printf("\nLog e of the value %.2f is %.2f", val , log(val));
    printf("\nsqrt of the value %.2f is %.2f", val , sqrt(val));
    printf("\n%.2f to the power %.2f is %.2f", val , power,  pow(val, power));
    return 0;
}