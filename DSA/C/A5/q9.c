#include <stdio.h>    
int main(){
    int len1, len2; 
    int flag=0;


    printf("Enter no. of elements in array1: ");            
    scanf("%d", &len1);
    int a[50];
    printf("Enter the elements in array1: ");
    for(int i=0; i<len1;i++)
    {
        scanf("%d", &a[i]);
    }


    printf("Enter no. of elements in array 2: ");         
    scanf("%d", &len2);
    printf("Enter the elements in array2: ");
    int b[len2];
    for(int i=0; i<len2;i++)
    {
        scanf("%d", &b[i]);
    }


    for(int i=0;i<len2;i++)
    {


        for(int j=0;j<len1;i++){
           
            if(b[i]!= a[j]) flag = 1; 
            else {
                flag = 0;
                break;}

        }


        if(flag == 1)
         {
            a[len1]=b[i]; 
            len1++;
            flag = 0;
        }


    }
    printf("The union of two arrays is: ");
    for(int i=0; i<=len1;i++){
        printf("%d\t", a[i]);
    }


return 0; 


}