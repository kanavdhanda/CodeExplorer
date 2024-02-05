#include <stdio.h>
int main(){
    printf("Enter number of rows: ");
    int r;
    scanf("%d", &r);
    int c;
    for(int i=0;i<r;i++){
        for(int sp=1;sp<=r-i;sp++){
            printf(" ");
        }
        for(int j=0;j<=i;j++){
            if(i==0 || j==0){
                c=1;
            }
            else{
                c=(c*(i-j+1))/j;
                
            }
            printf("%d ", c);
        }
        printf("\n");
    }

    return 0;
}