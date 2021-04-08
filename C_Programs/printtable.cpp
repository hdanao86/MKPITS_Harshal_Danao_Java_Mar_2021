#include<stdio.h>
void displaytable(int num)
{
	int cnt,res;
	for(cnt=1;cnt<=10;cnt++)
	{
		res=cnt*num;
		printf("\n%d * %d= %d",num,cnt,res);
	}
}
int main()
{
	int num;
	printf("\nenter number : ");
	scanf("%d",&num);
	displaytable(num);
}
