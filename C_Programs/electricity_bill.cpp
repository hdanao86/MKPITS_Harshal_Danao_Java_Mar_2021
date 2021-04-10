/* Write a program in C to calculate and print the Electricity bill of a given 
customer. The customer id., name and unit consumed by the user should be taken 
from the keyboard and display the total amount to pay to the customer. 
The charge are as follow : 
Unit 	Charge/unit
upto 199 	@1.20
200 and above but less than 400 	@1.50
400 and above but less than 600 	@1.80
600 and above 	@2.00*/
#include<stdio.h>
int main()
{
	int cid,uc;
	float total,newtotal;
	char name[20];
	printf("\n enter cutomer ID : ");
	scanf("%d",&cid);
	printf("\n enter your name : ");
	scanf("%s",&name);
	printf("\n enter unit consumed : ");
	scanf("%d",&uc);
	
	if(uc<200)
	{
		total=(float)uc*1.20f;
	}
	else if(uc>=200 && uc<400)
	{
		total=(float)uc*1.50f;
	}
	else if(uc>=400 && uc<600)
	{
		total=(float)uc*1.80f;
	}
	else if(uc>=600)
	{
		total=(float)uc*2.0f;
	}
	printf("\n Total bill before surcharge  bill = %f ",total);
	
	if(total<100)
	{
		total=100;
	}
	else if(total>400)
	{
		newtotal=total+(total*0.15);
	}
	printf("\n cutomer ID : %d ",cid);
	printf("\n cunstomer name : %s ",name);
	printf("\n Total Amount : %.2f Rs",newtotal);
}


