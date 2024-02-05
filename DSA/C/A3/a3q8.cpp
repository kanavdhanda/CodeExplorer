#include <stdio.h>
int main(){
	int a[5];
	int i;
	printf("Enter the elements: ");
	for(i=0;i<5;i++)
	{
		scanf("%d", &i);
	}
	int var=a[0];
	for(i=1;i<5;i++)
	{
		if(a[i])>var) var= a[i];
	}
	printf("Biggest is %d", var);
	var=0;
		for(i=1;i<5;i++)
	{
		if(a[i])<var) var= a[i];
	}
	printf("smallest is %d", var);
	var=0;
	int avg;
	for(i=0;i<5;i++)
	{
		avg=avg+ a[i];
	}
	printf("avg value is %d",avg/5);
	return 0;
}
