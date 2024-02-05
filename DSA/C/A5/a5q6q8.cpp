#include <stdio.h>
int main(){
	int len;
	printf("Enter number of elements in array: ");
	scanf("%d", &len);
	int a[len];
	int i;
	printf("Enter the elements: ");
	for(i=0;i<len;i++)
	{
		scanf("%d", &i);
	}
	int var=a[0];
	for(i=1;i<len;i++)
	{
		if(a[i]>var) var= a[i];
	}
	printf("Biggest is %d", var);
	var=0;
		for(i=1;i<len;i++)
	{
		if(a[i]<var) var= a[i];
	}
	printf("smallest is %d", var);
	var=0;
	int avg;
	for(i=0;i<len;i++)
	{
		avg=avg+ a[i];
	}
	printf("avg value is %d",avg/5);
	return 0;
}
