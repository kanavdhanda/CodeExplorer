#include <stdio.h>
int main()
{ 	int i;
	int len1,len2;
	printf("Enter the number of elements in array1 : ");
	scanf("%d", &len1);
	int a[len1];
	printf("Enter the elements in array 1: ");
	for(i=0; i<len1;i++)
	{
		scanf("%d", a[i]);
	}
	printf("Enter the number of elements in array2 : ");
	scanf("%d", &len2);
	printf("Enter the elements in array 2: ");
	int b[len2];
	for(i=0; i<len2;i++)
	{
		scanf("%d", b[i]);
	}
	int tlen= len1+len2;
	for(i=0;i<len2;i++){
		a[len1+i]=b[i];
		
	}
	printf("Merged array is: ");
	for(i=0;i<tlen;i++){
		printf("%d", &a[i]);
	}
	return 0;
}
