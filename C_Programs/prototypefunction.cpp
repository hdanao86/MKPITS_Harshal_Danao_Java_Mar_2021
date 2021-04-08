//declaring the prototype of function
int calculatetotal(int,int,int);
double calculatepercentage(int);
void calculategrade(double);

#include<stdio.h>
int main()
{
	int sub1,sub2,sub3,total;
	double per;
	printf("enter 3 subject marks");
	scanf("%d%d%d",&sub1,&sub2,&sub3);
	total=calculatetotal(sub1,sub2,sub3);
	printf("\n total marks=%d",total);
	per=calculatepercentage(total);
	printf("\n percenatage=%lf",per);
	calculategrade(per);
	printf("\n back to main function");
}
int calculatetotal(int sub1,int sub2,int sub3)
{
	int total=sub1+sub2+sub3;
	return total;
}
void calculategrade(double per)
{
	if(per>=75)
		printf("\n grade=distinction");
	else if(per>=60 && per<75)
		printf("\n grade=first");
	else
		printf("\nfail");
}
double calculatepercentage(int total)
{
	double per;
	per=(float)(total/300.0f)*100.0f;
	return per;
}
