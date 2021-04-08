#include<stdio.h>
int main()
{
	char name[5][20];
	int row;
	for(row=0;row<5;row++)
	{
		printf("\nenter student name : ");
		scanf("%s",&name[row]);
	}
	for(row=0;row<5;row++)
	{
		printf("\n student name is %s",name[row]);
	}
}
