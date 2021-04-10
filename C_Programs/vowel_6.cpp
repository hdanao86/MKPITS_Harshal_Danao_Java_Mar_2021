//6 Write a C program to check whether an alphabet is a vowel or consonant
#include<stdio.h>
int main()
{
	char ch;
	printf("\n Enter any charcter : ");
	scanf("%c",&ch);
	if (ch>='a'  && ch <='z' || ch>='A' && ch<='Z')
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	printf("\n enter character %c is a vowel ",ch);
	else
		printf("\n enter character %c is a consonant ",ch);
}
