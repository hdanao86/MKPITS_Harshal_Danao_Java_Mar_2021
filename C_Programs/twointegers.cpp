/*3 - create a function calculate with 2 integer parameters and calculate and display the addition of 2 no.*/
#include<stdio.h>
void calculate(int n1,int n2)
{
	int sum=n1+n2;
	printf("\nsum of two numbers = %d",sum);
}
int main()
{
	int num1,num2;
	printf("enter 2 numbers = ");
	scanf("%d%d",&num1,&num2);
	calculate(num1,num2);
	printf("\n back to main function");
}
