#include <stdio.h>
int main(){
    printf("Enter the number of elements in array: ");
    int size , a[50];
    scanf("%d", &size);
    printf("Enter the elements here: ");
    for(int i=0; i<size;i++){
        scanf("%d", &a[i]);
    }
    printf("Enter the location of the element to which we need to add: ");
    int loc;
    scanf("%d", &loc);
    size=size+1;
    for(int i = size-1;i>=(loc-1);i--){
        a[i+1]=a[i];
    }
    int new;
    printf("Enter the new varable: ");
    scanf("%d", &new);
    printf("The Updated array is: \n");
    a[loc-1]=new;
    for(int i= 0; i<size;i++)
    {
        printf("%d ", a[i]);
    }
    return 0;
}