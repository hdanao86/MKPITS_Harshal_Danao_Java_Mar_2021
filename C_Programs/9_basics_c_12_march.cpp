//WAP TO ACCEPT BASIC SALARY FROM THE USER AND CALCULATE HRA(17% OF BASIC)
//, DA(28% OF BASIC) , TA(56% OF BASIC) AND TOTAL SALARY.
#include<stdio.h>
int main()
{
	float basic_salary,hra,da,ta,total;
	printf("enter basic salary :");
	scanf("\n%f",&basic_salary);
	hra=(0.17f) * (basic_salary);
	printf("\n hra = %f  ",hra);
	da=(0.28f) * (basic_salary);
	printf("\n da = %f  ",da);
	ta=(0.56f) * (basic_salary);
	printf("\n ta = %f  ",ta);
	total=basic_salary+hra+da+ta;
	printf("\n total salary = %.2f ",total);
}
