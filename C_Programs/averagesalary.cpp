#include<stdio.h>
int main()
{
	int cnt,salary,total=0;
	float avg;
	for(cnt=1;cnt<=10;cnt++)
	{
		printf("\nenter salary of  employes :",cnt);
		scanf("%d",&salary);
		total=total+salary;
	}
	avg=(float)total/10;
	printf("\naverage salary : %f",avg);
	return 0;
}
