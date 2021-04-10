//Write a program in C to read 10 numbers from keyboard and find their sum and average.
#include<stdio.h>
int main()
{
	int cnt,num,sum=0;
	float avg;
	printf("enter 10 numbers :\n");
	for (cnt=1;cnt<=10;cnt++)
	{
		printf("\n number %d :",cnt);
		scanf("%d",&num);
		sum=sum+cnt;
	}
	avg=(float)sum/10.0f;
	printf("\n The sum of 10 numbers is : %d\nThe Average is : %.2f\n ",sum,avg);
}
