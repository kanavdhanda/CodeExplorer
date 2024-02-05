#include <math.h>
#include <stdio.h>
int main(){
    float num , root;
    printf("Enter the number: ");
    scanf("%f", &num);
    printf("Enter which root to find: ");
    scanf("%f", &root);
    printf(" The %fth rooth of %f is %.2f", root , num , pow(num, (1.0/root)));
    return 0;
}