//5 wap to accept empname , designation and salary and then display it.
#include<stdio.h>
int main()
{
	char empname[20],designation [20];
	double salary;
	printf("\n enter empname : ");
	scanf("%s",&empname);
	printf("\nenter designation : ");
	scanf("%s",&designation);
	printf("\n enter salary : ");
	scanf("%lf",&salary);
	printf("\n employee name is %s",empname);
	printf("\n designation is %s",designation);
	printf("\n salary is %lf",salary);
}
