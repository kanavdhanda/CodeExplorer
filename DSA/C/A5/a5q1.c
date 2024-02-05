#include <stdio.h>
int main(){
	int a[50];
	int len;
	printf("Enter number of elements in array: ");
	scanf("%d", &len);
	int i;
	printf("Enter the elements of the array: ");
	for(i=0; i<len;i++){
		scanf("%d", &a[i]);
	}
	int rev[len];
	int z=0;
	for(i=len-1;i>=0;i--){
		rev[i]=a[z];
		z++;
	}

	return 0;
}
