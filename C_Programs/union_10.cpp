#include<stdio.h>
#include<conio.h>
#include<string.h>
union data
{
	int i;
	float j;
	char k[10];
};
int main()
{
	union data d1;
	d1.i=25;
	d1.j=2.5f;
	strcpy(d1.k,"plus");
//	printf("\n value of i=%d",d1.i);
//	printf("\n value of j=%f",d1.j);
	printf("\n value of k=%s",d1.k);
	
}
