#include<stdio.h>
int main()
{
	int cnt,num,res;
	printf("enter number");
	scanf("%d",&num);
	printf("\n table of number : ",num);
	for(cnt=1;cnt<=10;cnt++)
	{
		res=num*cnt;
		printf("\n%d\tx\t%d\t=\t%d\n",num,cnt,res);
	}
}
