#include<stdio.h>
int main()
{
	int num,fact=1;
	int cnt;
	printf("enter number = ");
	scanf("%d",&num);
	for(cnt=num;cnt>0;cnt--)
	{
		fact = fact * cnt;
	}
	printf("\n factorial = %d",fact);
}
