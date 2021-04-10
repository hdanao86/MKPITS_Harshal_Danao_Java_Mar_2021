//Write a C program to find the sum of first 10 natural numbers.
#include<stdio.h>
int main()
{
	int num;
	int sum=0;
	for(num=1;num<=10;num++)
	{
		printf("\n%d",num);
		sum=sum+num;
	}
	printf("\n The sum of first 10 natural numbers = %d\n",sum);
}
