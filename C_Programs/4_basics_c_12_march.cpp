#include<stdio.h>
#include<conio.h>
int main()
{
	char ch;
	printf("enter any character");
	scanf("%c",&ch);
	printf("\nenter another character");
	ch=getch();
	printf("\nch = %c",ch);
	printf("\nenter another character");
	ch=getche();
	printf("\nch = %c",ch);
}
