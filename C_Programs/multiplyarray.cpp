//10 wap to create  a array of 5 element then multiply the elements of array and then display it.
#include<stdio.h>
int main()
{
	int num[5]={1,2,3,4,5};
	int cnt;
	printf("enter number");
	scanf("%d",&num);
	for(cnt=0;cnt<5;cnt++)
	{
		num * num[cnt];
	}
	printf("\nmultiply array %d",&num[cnt]);
}
