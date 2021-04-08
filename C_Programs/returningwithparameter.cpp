//3- function returning any value and with parameters.
#include<stdio.h>
int calculate(int n1,int n2)
{
	int sum=n1+n2;
	return sum;
}
int main()
{
	int num1,num2,res;
	printf("enter 2 numbers");
	scanf("%d%d",&num1,&num2);
	res=calculate(num1,num2);
	printf("\n sum of two numbers=%d",res);
	printf("\n back to function");
	
}
