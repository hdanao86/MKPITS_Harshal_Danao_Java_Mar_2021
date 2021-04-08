#include<stdio.h>
int main()
{
	int empno;
	char empname[20];
	float basic_salary,hra,da,ta,total_salary=0;
	printf("enetr employee number");
	scanf("%d",&empno);
	printf("enter employee name");
	scanf("%s",&empname);
	printf("enter basic salary");
	scanf("%f",&basic_salary);
	hra=basic_salary*0.15f;
	da=basic_salary*0.25f;
	ta=basic_salary*0.55f;
	total_salary=hra+da+ta+basic_salary;
	printf("\nempno\t emname\t basic salary\t  hra\t\tda\t ta\t\t total salary");
	printf("\n %d\t %s\t %.2f \t %.2f\t%.2f\t%.2f\t.%2f",empno,empname,basic_salary,hra,da,ta,total_salary);
	
}
