//wap to accept empno empname and basic_salary then calculate hra (15% of basic salary) , da (25% of basic) , ta (55% of basic) , total salary(basic_Salary + hra + da+ ta)
#include<stdio.h>
int main()
{
	int empno;
	char empname[20];
	float basic_salary,hra,da,ta,total_salary=0;
	printf("enter emp no");
	scanf("%d",&empno);
	printf("enter emp name");
	scanf("%s",&empname);
	printf("enter basic salary");
	scanf("%f",&basic_salary);
	hra=basic_salary*0.15f;
	da=basic_salary*0.25f;
	ta=basic_salary*0.55f;
	total_salary=hra+da+ta+basic_salary;
	printf("\n empno \t empname \t basic salary \t hra \t da \t ta \t total salary");
	printf("\n");
	printf("\n%d \t %s \t %.2f \t %.2f \t %.2f \t %.2f \t %.2f",empno,empname,basic_salary,hra,da,ta,total_salary);
}
