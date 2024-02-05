#include <stdio.h>
#define PI 3.14159
int main(){
    float rad , area;
    printf("Enter the radius of circle: ");
    scanf("%f", &rad);
    area = PI*rad*rad;
    printf("The area of circle with radius %f is %f", rad , area);
    return 0;
}