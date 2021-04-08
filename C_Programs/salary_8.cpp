/*8 create a structure employee having members empno,empname,basicsalary, hra,da,ta,bonus, total salary.
calculate hra 25% of basic
da 35% of basic
ta 85% of basic
bonus =52% of basic
totalsalary =hra+da+ta+bonus +basic.*/
#include<stdio.h>
#include<conio.h>
#include<string.h>
struct employee
	{
		int empno;
		char empname[20];
		double basic_salary;
		float hra,da,ta,bonus,total_salary;
	};
	int main()
	{
		struct employee emp1;
		printf("enter employee number");
		scanf("%d",&emp1.empno);
		printf("enter employe name");
		scanf("%s",&emp1.empname);
		printf("enter basic salary");
		scanf("%lf",&basic_salary);
		hra=basic_salary*0.25
		da=basic_salary*0.35;
		ta=basic_salary*0.85;
		bonus=basic_salary*0.85;
		total=hra+da+ta+bonus+basic_salary;
		strcpy(emp1.empname[20]);
		printf("\n employee no = %d",emp1.empno);
		printf("\n employe name = %s",emp1.empname);
		printf("\n hra = %f",emp1.hra);
		printf("\n da = %f",emp1.da);
		printf("\n ta = %f",emp1.ta);
		printf("\n bonus = %f",emp1.bonus);
		printf("\n total salary = %.2f",emp1.total_salary);
	}
	
