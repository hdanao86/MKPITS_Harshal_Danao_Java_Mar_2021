/* Write a C program to check whether a number is a Strong Number or not.
Input a number to check whether it is Strong number: 15
Expected Output :
15 is not a Strong number.
(Strong number is a number whose sum of all digits' factorial is equal to the number 'n'. ... So, to find a number whether its strong number, we have to pick every digit of the number like the number is 145 then we have to pick 1, 4 and 5 now we will find factorial of each number i.e, 1! = 1, 4! = 24, 5! = 120.
*/
#include<stdio.h>

int fact(int r)
{
	int mul=1;
	for(int i=1;i<=r;i++)
	{
		mul=mul*i;
	}
	return mul;
}

int main()
{
	int num;
	int sum=0;
	printf("enter a number :");
	scanf("%d",&num);
	int k=num;
	int r;
	while(k!=0)
	{
		r=k%10;
		int f=fact(r);
		k=k/10;
		sum=sum+f;
	}
	if(sum==num)
	{
		printf("\n Number is strong number");
	}
	else
	{
		printf("\nNumber is not strong number");
	}
}
