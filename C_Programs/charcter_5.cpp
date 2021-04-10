//5 Write a C program to check whether a character is an alphabet, 
//digit or special character
#include<stdio.h>
int main()
{
	char ch;
	printf("enter any character : ");
	scanf("%c",&ch);
	if(ch >='a' && ch <='z') 
	{
		printf("\n %c is alphabet",ch);
	}
	else if(ch >= '0' && ch <= '9')
	{
		printf("\n %c is digit",ch);
	}
	else
	{
		printf("\n %c is a special character",ch);
	}
}
