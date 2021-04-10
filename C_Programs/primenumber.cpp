// Write a C program to determine whether a given number is prime or not. 
#include<stdio.h>
int main()
{
	int num=2,cnt,rem;
	printf("\n enter any number :");
	scanf("%d",&num);
	for(cnt=1;cnt<=num;cnt++)
	{
		rem=cnt%num;
		if(rem==0)
		{
			printf("\n%d : is an prime no. ",cnt);
		}
		else 
		{
			printf("%d is no prime no.",cnt);
		}
	}
}
