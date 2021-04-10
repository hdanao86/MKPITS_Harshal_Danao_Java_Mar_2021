//Write a program in C to display the n terms of odd natural number and their sum 
#include<stdio.h>
int main()
{
	int num,cnt,i,sum=0;
	
	printf("\n enter n terms of number :");
	scanf("%d",&num);
	printf("\n The odd numbers are :");
	for(cnt=1;cnt<=num;cnt++)
	{
		i=cnt*2-1;
		printf("%d",i);
		sum=sum+cnt*2-1;
	}
	printf("\n The sum of odd numbers upto %d terms = %d \n",num,sum);
}
