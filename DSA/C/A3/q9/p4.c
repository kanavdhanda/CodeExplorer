#include <stdio.h>
int main(){
    int arm, num1,num2, num3, len;
    arm=0;
    num1=0;
    num2=0;
    num3=0;
    len=0;
    for( int i=1;i<=500;i++){
        num1 = i;
        num2 = i;
        num3 = i;
        while(num1>0){
            len++;
            num1=num1/10;
        }
        while(num2>0){
            arm=arm + pow(num2%10,len);
            num2=num2/10;
        }
        if(arm==num3) printf("%d is armstrong", num3);
        else printf("%d is not armstrong", num3);
        arm=0;
        len=0;
    }
}