#include <stdio.h>
int main() {
  int len1, len2;
  int flag = 0;
  int i, j;

  printf("Enter no. of elements in array1: ");
  scanf("%d", &len1);
  int a[50];
  printf("Enter the elements in array1: ");
  for (i = 0; i < len1; i++) {
    scanf("%d", &a[i]);
  }

  printf("Enter no. of elements in array 2: ");
  scanf("%d", &len2);
  printf("Enter the elements in array2: ");

  int b[len2];
  for (i = 0; i < len2; i++) {
    scanf("%d", &b[i]);
  }

  for (i = 0; i < len2; i++) {
    flag = 0;
    for (j = 0; j < len1; j++) {

      if (b[i] == a[j]){
        flag = 1; break;}
      }
    

    if (flag == 0) {
      a[len1] = b[i];
      len1++;
      
    }
  }
  printf("The union of two arrays is: ");
  for (i = 0; i <= len1; i++) {
    printf("%d\t", a[i]);
  }

  return 0;
}