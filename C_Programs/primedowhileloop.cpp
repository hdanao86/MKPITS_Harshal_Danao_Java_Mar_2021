//wap to accept a number and print whether it is a prime no. or not.using do while loop
#include<stdio.h>
int main()
{
	int num,cnt=2,rem=0;
	printf("enter number : ");
	scanf("%d",&num);
	do
	{
		rem=num%cnt;
		if(rem==0)
		{
			break;
		}
		cnt++;
	}
	while(rem<cnt);
	if(cnt==num)
	{
		printf("\n number is prime");
	}
	else
	{
		printf("\n number is not prime");
	}
}

