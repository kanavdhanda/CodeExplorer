#include <stdio.h>
int main(){
    printf("Enter number of rows in triangle: ");
    int n;
    scanf("%d", &n);
    for(int i=1;i<=n;i++){
        for(int sp=1;sp<=(n-i);sp++){
            printf(" ");
        }

        for(int c=i;c<=(2*i-1);c++){
            printf("%d", c%10);
        }
        for(int c=(2*i-2);c>=i;c--){
            printf("%d", c%10);
        }
    }
    return 0;
}