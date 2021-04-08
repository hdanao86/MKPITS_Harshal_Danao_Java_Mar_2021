//9 wap to create a float array 0 10 elements to store salary of 10 employees
#include<stdio.h>
int main()
{
	float salary[10];
	int cnt;
	for(cnt=0;cnt<10;cnt++)
	{
		printf("\nsalary of employee");
		scanf("%f",&salary[cnt]);
	}
	for(cnt=0;cnt<10;cnt++)
	{
		printf("salary[%f]=%f",cnt,salary[cnt]);
	}
}
