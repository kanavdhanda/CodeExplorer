#include <stdio.h>
int main(){
    int num ,pow, sol;
    printf("Enter number: ");
    scanf("%d", &num);
    printf("Enter to which power: ");
    scanf("%d", pow);
    for(int i=1;i<=pow;i++) sol*=num;
    printf("%d to the power %d is : %d", num, pow , sol);

}