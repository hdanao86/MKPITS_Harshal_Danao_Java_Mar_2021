#include<stdio.h>
#include<conio.h>
#include<string.h>

int main()
{
	struct product
{
	int prodid;
	char prodname[10];
	double price;
} prod1;
	//declaring a variable of structure type
	//struct employee emp1;
	// emp1.name="ravi"; error will come you cannot assign a string value with =
	//use strcpy function to copy a string
	//for emp1
	prod1.prodid=10;
	strcpy(prod1.prodname,"shirt");
	prod1.price=100;
	printf("\n prodid =%d",prod1.prodid);
	printf("\n prodname=%s",prod1.prodname);
	printf("\n price=%lf",prod1.price);
	
}

