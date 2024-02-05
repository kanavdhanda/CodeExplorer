#include <stdio.h>
int main(){
    int num, flag;
    flag=0;
    printf("Enter a number: ");
    scanf("%d", &num);
    
    for(int i=2;i<num;i++)
    {
        if(num%i==0) {
            flag = 1;
            break;
        }
    }

    if(flag==1) printf("Number %d is non prime", num);
    else printf("Number %d is a prime number" , num);
    return 0;
}