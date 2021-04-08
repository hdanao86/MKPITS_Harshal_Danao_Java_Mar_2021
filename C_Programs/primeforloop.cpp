#include<stdio.h>
int main()
{
	int num,cnt,rem=0;
	printf("enter number");
	scanf("%d",num);
	for(cnt=2;cnt<=num/2;cnt++)
	{
		if(num%cnt==0)
		{
			rem=1;
			break;
		}
	}
	    if(rem=0)
	    printf("\n%d is a prime number",num);
	    else
	    printf("\n%d is not prime number",num);
}
