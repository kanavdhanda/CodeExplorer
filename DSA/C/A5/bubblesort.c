#include <stdio.h>
int main(){
    printf("Enter the number of elements: ");
    int len;
    scanf("%d",&len);
    int a[len];
    printf("Enter the elements of array: ");
    for(int i=0;i<len;i++){
        scanf("%d", &a[i]);
    }
    printf("The Sorted array is: \n");
    for(int i=0;i<len;i++){
        for(int j=0;j<len-i;j++){
            if(a[j]>a[j+1]){
                int temp= a[j+1];
                a[j+1]=a[j];
                a[j]=temp;
            }
        }
    }
    for(int i=0;i<len;i++){
        printf("%d\t", a[i]);
    }
    return 0;
}