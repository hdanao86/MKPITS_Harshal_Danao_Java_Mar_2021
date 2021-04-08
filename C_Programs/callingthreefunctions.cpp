#include<stdio.h>
#include<conio.h>
int calculatetotal(int sub1,int sub2,int sub3)
{
	int total;
	total=sub1+sub2+sub3;
	return (total);
}
double calculateprcentage(int total)
{
	double percentage;
	percentage=(double)(total/300.0f)*100.0f;
}
void calculategrade(double per)
{
	if(per>=75)
		printf("\n grade=distinction");
	else if(per>=60 && per<75)
		printf("\n grade= first");
	else
		printf("\n fail");	
}
int main()
{
	int sub1,sub2,sub3,res;
	double per;
	printf("enter 3 subject marks");
	scanf("%d%d%d",&sub1,&sub2,&sub3);
	res=calculatetotal(sub1,sub2,sub3);
	printf("\n total marks= %d",res);
	per=(double)calculatepercentage(res);
	    printf("\n percentage=%lf",per);
	calculategrade(per);
	    printf("\n back to main function");
}
