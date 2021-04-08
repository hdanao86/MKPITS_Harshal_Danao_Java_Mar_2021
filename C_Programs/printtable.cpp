//wap to accept a number and print table of that number using for loop.
#include<stdio.h>
int main()
{
	int num,res=1;
	int cnt;
	printf("\nenter number : ");
	scanf("%d",&num);
	printf("\ntable of a number = %d\n",num);
	for(cnt=1;cnt<=10;cnt++)
	{
		res=num*cnt;
		printf("\n%d * %d = %d",num,cnt,res);
	}
}
