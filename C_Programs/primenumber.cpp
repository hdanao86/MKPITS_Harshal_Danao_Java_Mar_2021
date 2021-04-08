//use of break statement inside a loop

// wap to accept a number and print whether it is a prime no. or not.
#include<stdio.h>
int main()
{
	int num,cnt=2,rem=0;
	printf("enter number");
	scanf("%d",&num);
	while(cnt<num)
	{
		rem=num%cnt;
		if(rem==0)
		{
			break;
		}
		cnt++;
	}
	if(cnt==num)
	{
		printf("\n %d number is prime no.",num);
	}
	else
	{
		printf("\n %d number is not prime no.",num);
	}
}
