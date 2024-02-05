#include <stdio.h>
int main()
{
	int a[50];
	int len;
	printf("Enter the number of elements in array: ");
	scanf("%d", &len);
	printf("Enter the elements of the array: ");
	int i;
	for( i=0; i<len;i++)
	{
		scanf("%d", &a[i]);
	}
	len++;
	int pos;
	int value;
	printf("Enter the position of the element: ");
	scanf("%d", &pos);
	printf("Enter the variable to be added: ");
	scanf("%d",&value);



	for(i =len-1;i>=pos;i--)
	{
		a[i]=a[i-1];
	}


	
	a[pos]=value;
	printf("New array is: ");
	for(i=0; i<len;i++)
	{
		printf("%d\t", a[i]);
	}
}
