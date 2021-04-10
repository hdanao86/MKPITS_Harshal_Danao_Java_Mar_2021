//Write a C program to calculate profit and loss on a transaction.
#include<stdio.h>
int main()
{
	float pp,sp,p,l,pper,lper;
	printf("\n enter purcahse price : ");
	scanf("%f",&pp);
	printf("\n enter selling price : ");
	scanf("%f",&sp);
	
	if(pp<=sp)
	{
		p=sp-pp;
		pper=(float)(p/pp)*100.0f;
		printf("\n profit = %.2f Rs",p);
		printf("\n profit percent = %.2f %",pper);
	}
	if(sp<pp)
	{
		l=pp-sp;
		lper=(float)(l/pp)*100.0f;
		printf("\n loss = %.2f Rs",l);
		printf("\n loss percent = %.2f %",lper);
	}
}
