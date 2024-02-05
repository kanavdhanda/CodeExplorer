#include <stdio.h>
int main(){
    float sal;
    printf("Enter the salary of person: ");
    scanf("%f", &sal);
    float da = (10/100)*sal;
    float ta = (10/100)*sal;
    float gross = sal + da +ta;
    printf("The Gross Salary of person will be : %.2f", gross);
}