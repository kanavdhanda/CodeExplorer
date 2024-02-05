#include<stdio.h>
#include <string.h>
#include <stdlib.h>
int main(){
float val;
char str[20];
strcpy(str, "Hello");
val = atof(str);
printf("String value = %s, Float value  = %f\n", str , val);
}