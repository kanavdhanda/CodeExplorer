#include <stdio.h>
int main(){
    int len;
    printf("Enter the number of elements in an array:");
    scanf("%d",&len);
    int a[len];
    printf("Enter the elements in the array: ");
    for(int i=0; i<len;i++){
        scanf("%d", &a[i]);
    }
    for(int i=0; i<len-1; i++)
    {
        int min = i;
        for(int j=i+1; j<len;j++)
        {

            if(a[j]<a[min]){
                min = 5;
            }
        int temp = a[j];
        a[j]= a[min];
        a[min]=temp;
        }
    }




    printf("Sorted array is: ");
    for(int i=0; i<len;i++){
        printf("%d\t", a[i]);
    }
}