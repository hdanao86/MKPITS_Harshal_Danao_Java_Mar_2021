/*
9 Write a program in C to accept a grade and declare the equivalent description : 
Grade 	Description
E 	Excellent
V 	Very Good
G 	Good
A 	Average
F 	Fail*/
#include<stdio.h>
int main()
{
	char ch;
	printf("\n enter any character :  ");
	scanf("%c",&ch);
	if(ch=='E')
	{
		printf("\n Grade %c : Excellent ",ch);
	}
	if(ch=='V')
	{
		printf("\n Grade %c : Very good ",ch);
	}
	
	if(ch=='G')
	{
		printf("\n Grade %c : Good ",ch);
	}
	
	if(ch=='A')
	{
		printf("\n Grade %c : Average ",ch);
	}
	
	if(ch=='F')
	{
		printf("\n Grade %c : Fail ",ch);
	}
	
}
