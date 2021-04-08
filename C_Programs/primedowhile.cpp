#include<stdio.h>
int main()
{
	int num,cnt=2,rem=0;
	printf("enter number");
	scanf("%d",&num);
	fflush(stdin);
	do
	{
		rem=num%cnt;
		while(rem==0);
		cnt++;
}
	while(cnt==num);
		printf("\n Number is prime no.");
	
	while(cnt<num);
	{
			printf("\n number is not prime no.");
	
	}

