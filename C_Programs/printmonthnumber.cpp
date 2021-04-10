//Write a program in C to read any Month Number in integer and 
//display the number of days for this month.
#include<stdio.h>
int main()
{
	int num;
	printf("\n enter month number : ");
	scanf("%d",&num);
	if(num==1)
	{
		printf("\n January : 31 Days ");
	}
	else if(num==2)
	{
		printf("\n Febraury : 28 Days ");
	}
	else if(num==3)
	{
		printf("\n March : 31 Days");
	}
	else if(num==4)
	{
		printf("\n April : 30 Days");
	}
	else if(num==5)
	{
		printf("\n May : 31 Days");
	}
	else if(num==6)
	{
		printf("\n June : 30 Days");
	}
	else if(num==7)
	{
		printf("\n July : 31 Days");
	}
	else if(num==8)
	{
		printf("\n August : 31 Days");
	}
	else if(num==9)
	{
		printf("\n September : 31 Days");
	}
	else if(num==10)
	{
		printf("\n October : 30 Days");
	}
	else if(num==11)
	{
		printf("\n November : 31 Days");
	}
	else if(num==12)
	{
		printf("\n December : 31 Days");
	}
}
