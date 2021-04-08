//wap to accept a number and print whether it is a prime no. or not using for loop
#include<stdio.h>
int main()
{
	int num,cnt,rem=0;
	printf("enter number");
	scanf("%d",&num);
	for(cnt=2;rem<cnt;cnt++)
	{
		rem=num%cnt;
		if(rem==0)
		{
		break;
	}
	}
	if(cnt==num)
{
	printf("\n number is prime no.  ");
}
else
{
	printf("\n number is not prime no.  ");
}
}
