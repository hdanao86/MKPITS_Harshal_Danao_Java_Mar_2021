//Write a program in C to display the multiplication table of a given integer
#include<stdio.h>
int main()
{
	int num,cnt,res=1;
	printf("\n enter any number : ");
	scanf("%d",&num);
	for(cnt=1;cnt<=10;cnt++)
	{
		res=num*cnt;
		printf("%d x %d = %d",num,cnt,res);
		printf("\n");
	}
}
