#include<stdio.h>
#include<conio.h>
int main()
{
	int sub1,sub2,sub3,total,percentage;
	printf("enter the sub1");
	scanf("%d",&sub1);
	printf("enter the sub2");
	scanf("%d",&sub2);
		printf("enter the sub3");
	scanf("%d",&sub3);
	total=sub1+sub2+sub3;
	printf("total marks = %d",total);
	percentage=sub1+sub2+sub3/300*100;
	printf("percentage = %d",percentage);
}
