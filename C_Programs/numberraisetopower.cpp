// Write a program in C to display the power of the number upto given an integer. eg 2 raise 3 = 8
#include<stdio.h>
int main()
{
	int num,a,cnt,sum=1;
	printf("\n enter any number :");
	scanf("%d",&num);
	printf("\n enter the raise to power :");
	scanf("%d",&a);
	
	for (cnt=1;cnt<=a;cnt++)
	{
		sum=sum*num;
	}
	printf("\n%d to the power %d = %d",num,a,sum);
}

