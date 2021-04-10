//2 Write a C program to find the largest of three numbers
#include<stdio.h>
int main()
{
	int num1,num2,num3;
	printf("enter number : ");
	scanf("%d%d%d",&num1,&num2,&num3);
	if(num1 > num2)
	{
		printf("\n number 1 is greater");
	}
	else if(num2 > num3)
	{
		printf("\n number 2 is greater");
	}
	else
	{
		printf("\n number 3 is greater");
	}
}
