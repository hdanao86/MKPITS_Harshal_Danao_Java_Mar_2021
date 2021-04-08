//3- wap to create a array 5 element to store salary of 5 employees then sum the salary and display it.
#include<stdio.h>
int main()
{
	float salary[5];
	int cnt;
	float sum=0.0f;
	for(cnt=0;cnt<5;cnt++)
	{
		printf("\nenter salary of employee");
		scanf("%f",&salary[cnt]);
		sum=sum+salary[cnt];
	}
		printf("\ntotal salary=%f",sum);
}
