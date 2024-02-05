#include <stdio.h>
int main(){
    int a[50];
    int len =10;


    for(int i=0;i<len;i++){
        scanf("%d",&a[i]);
    }


    printf("Enter number to be found: ");
    int num;
    scanf("%d", &num);
    int start , end , mid;
    start=0;
    end= len-1;
    mid = (end-start)/2 + start;
    int ind;
    while(start<=end){
        if(num>a[mid]){
            start=mid;
            mid= (end-start)/2 + start;
        }
        else if(num<a[mid]){
            end=mid;
            mid=(end-start)/2 + start;
        }
        else{ ind = mid;
        break;
        }
    }
    printf("Number is found at index %d", ind);
}