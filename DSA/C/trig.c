#include <stdio.h>
int main(){
    printf("Enter the number of rows: ");
    int r;
    scanf("%d", &r);
    int z=(r/2)+1;
    for(int i=1;i<=z;i++){
        for(int space=r-i;space>=1;space--){
            printf(" ");
        }
        for(int c=1;c<=i;c++){
            printf("*");
        }
        for(int c=i-1;c>=1;c--){
            printf("*");
        }
        printf("\n");
    }
    for(int i=z-1;i>=1;i--){
        for(int space=r-i;space>=1;space--){
            printf(" ");
        }
        for(int c=i-1;c>=1;c--){
            printf("*");
        }
        for(int c=1;c<=i;c++){
            printf("*");
        }
        printf("\n");
    }
}