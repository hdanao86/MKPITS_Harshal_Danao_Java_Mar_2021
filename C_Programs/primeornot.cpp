#include<stdio.h>
int main()
{
	int num,cnt=2,rem=0;
	printf("enter number"); // 5
	scanf("%d",&num);
	while(cnt < num)
	{
		rem=num % cnt ; // rem = 5 % 4 = 1
		if(rem==0)
		{
			break; // break is used to come out of the loop
		}
		cnt++; // 5
	}
	if(cnt == num)
	{
		printf(" \n Number is prime no.");
	}
	else
	{
		printf("\n Number is not a prime no.");
	}
	
	return 0;
}

