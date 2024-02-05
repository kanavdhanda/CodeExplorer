#include <stdio.h>
int main(){
	int i;
	int len;
	printf("No. of elements: ");
	scanf("%d", &len);
		int a[len];
		printf("Enter elements: ");
	for(i=0;i<len;i++){
		scanf("%d",&a);
	}
	printf("Enter num to be deleted: ");
	int del;
	int ind=0;
	scanf("%d", &del);
	for(i=0;i<len;i++){
		if(a[i]==del){
			 ind=i;
			break;
		}
	}

	for(i=ind;i<len-1;i++)
	{
		a[i]=a[i+1];
	}
	len--;
	printf("New array is: ");
	for(i=0; i<len;i++)
	{
		printf ("%d", a[i]);
	}
	return 0;
}
