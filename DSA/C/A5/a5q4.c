#include <stdio.h>
int main(){
	int len;
	printf("Enter the number of elements of array: ");
	scanf("%d", &len);
	int a[len];
	printf("Enter elements: ");
	for(int i=0;i<len;i++){
		scanf("%d", &a[i]);
	}
	printf("Enter number find :");
	int find;
	int ind=0;
	scanf("%d", &find);
	for(int i=0; i<len;i++){
		if(a[i] == find)
		{
			ind = i+1;
			break;
		}
	}
	if(ind == 0){
		printf("Number not found :(");
	}
	else printf("number is found at index : %d", ind);
	return 0;
}
