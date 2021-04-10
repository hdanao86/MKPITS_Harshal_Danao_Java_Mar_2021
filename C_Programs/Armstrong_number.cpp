//Write a C program to check whether a given number is an armstrong number or not. 
//Input a number: 153
//Expected Output :
//153 is an Armstrong number.

#include<stdio.h>
int main()
{
	int num,res,sum=0,temp;
	printf("\n Enter the number :");
	scanf("%d",&num);
	temp=num;
	while(num>0)
	{
		res=num%10;
		sum=sum+(res*res*res);
		num=num/10;	
	}
	if(temp==sum)
		printf("\n is an Armstrong number");
		else
		{
			printf("\n  is not an Armstrong number ");
		}
}
