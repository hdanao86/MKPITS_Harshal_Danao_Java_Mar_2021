#include<stdio.h>
void checkprimeno (int num)
{
	int cnt=2,rem;
	while (cnt<num)
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
		printf("\n%d is a prime no.",num);
	}
	else
	{
		printf("\n%d is not a prime no.",num);
	}
}
int main()
{
	int num;
	printf("enter number ");
	scanf("%d",&num);
	checkprimeno(num);
}
