//Write a C program to check whether an alphabet is a vowel or consonant using switch case
#include<stdio.h>
int main()
{
	char ch;
	printf("enter any character : ");
	scanf("%c",&ch);
	switch(ch)
	{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
		printf("\n character %c is vowel",ch);
		break;
		default :
		printf("\n character %c is consonant",ch);	
		
	}
}

