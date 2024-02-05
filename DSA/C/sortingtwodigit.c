#include <stdio.h>
int len(int num);

int len(int num){
    int lenth=0;
    while(num>0){
        lenth++;
        num/=10;
    }
    printf("%d",lenth);
    return lenth;
}

int main(){
    int length;
    printf("Enter Length: ");
    scanf("%d", &length);
    int a[length];

    printf("Enter the elements of array: ");
    for(int i=0;i<length;i++){
        scanf("%d", &a[i]);
    }
    int j=0;
    int ind1[length];

    for(int i=0;i<length;i++){
        if(len(a[i])==2){
            ind1[j] = i;
            j++;
        }
    }
    printf("%d\n",j);
        for (int i = 0; i <= j; i++) {
        for (int k = 0; k <= j - i; k++) {
            if (a[ind1[k]] > a[ind1[k + 1]]) {
                int temp = a[ind1[k]];
                a[ind1[k]] = a[ind1[k + 1]];
                a[ind1[k + 1]] = temp;
            }
        }
    }
    printf("Sorted array is: ");
    for(int i=0;i<length;i++){
        printf("%d\t", a[i]);
    }
    return 0;
}