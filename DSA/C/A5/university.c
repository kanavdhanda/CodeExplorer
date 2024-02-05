#include <stdio.h>
#include <string.h>
int main(){
    char c[]="university";
    for(int i=1;i<strlen(c);i+=2){
        for(int j=0;j<=i;j++){
            printf("%c", c[j]);
        }
        printf("\n");
    }
     for(int i=(strlen(c)-3);i>=1;i-=2){
        for(int j=0;j<=i;j++){
            printf("%c", c[j]);        }
        printf("\n");
    }
    return 0;
}