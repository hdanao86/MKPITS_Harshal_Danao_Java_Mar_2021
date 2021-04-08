/*5- create function 
	a- calculatetotal(int sub1,int sub2,int sub3)
	b - calculatepercentage(int total)
	c- calculategrade(float per)*/

#include<stdio.h>
void calculatetotal(int sub1,int sub2,int sub3)
{
	int total=sub1+sub2+sub3;
	printf("\ntotal marks=%d",total);
	calculatepercentage(total);
}
void calculatepercentage(int total)
{
	float per;
	per=(float)(total/300.0f)*100.0f;
	printf("\npercentage=%f",per);
	calculategrade(per);
}
void calculategrade(float per)
{
	printf("\n percentage=%lf",per);
	if(per >= 75)
		printf("\n grade = Distinction");
	else if(per>=60 && per<75)
		printf("\n grade = First");
	else
		printf("\n Fail");
int main()
{
	int sub1,sub2,sub3;
	printf("enter 3 subject marks");
	scanf("%d%d%d",&sub1,&sub2,&sub3);
	calculatetotal(sub1,sub2,sub3);
	printf("\n back to main function");
}
}
