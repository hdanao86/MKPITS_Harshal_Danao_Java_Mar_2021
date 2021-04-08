//3- function returning any value and without parameters.
#include<stdio.h>
int calculate()
{
	int num1,num2,sum;
	printf("enter 2 numbers");
	scanf("%d%d",&num1,&num2);
	sum=num1+num2;
	return sum;
}
int main()
{
	int res=calculate();
	printf("\n sum of two numbers=%d",res);
	printf("\n back to main function");
}

