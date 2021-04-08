// wap to create a float array 0 10 elements to store salary of 10 employees
#include<stdio.h>
int main()
{
	int cnt,num;
	double salary[10];
	for(cnt=0;cnt<10;cnt++)
	{
		printf("enter salary of %d : ",cnt);
		scanf("%lf",&salary[cnt]);
}
for(cnt=0;cnt<10;cnt++)
{
	printf("\n salary of %d = %.2lf",cnt,salary[cnt]);
}
}
