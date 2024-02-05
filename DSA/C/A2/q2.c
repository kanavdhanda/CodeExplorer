#include <stdio.h>
#include <math.h>
int main(){
    float a, b, c;
    printf("Enter the coefficient of x^2: ");
    scanf("%f", &a);
    printf("Enter the coefficient of x: ");
    scanf("%f", &b);
    printf("Enter the constant value: ");
    scanf("%f", &c);
    float disc=(b*b - 4*a*c);


    if(disc>0) printf ("The roots of the equation %fx^2+%fx+%f are %f and %f", a , b ,c , ((-b+sqrt(disc))/2.0*a), ((-b-sqrt(disc))/2.0*a));


    else if (disc=0) printf("The equation %fx^2+%fx+%f will have one common root: %f", a , b, c ,((-b+sqrt(disc))/2.0*a));


    else printf("The equation %.1fx^2+%.1fx+%.1f will have non real roots %.1f + %.1fi and %.1f-%.1fi", a ,b ,c, -b/2.0*a,sqrt(-disc)/2.0*a , -b/2.0*a,sqrt(-disc)/2.0*a);
    return 0;
}