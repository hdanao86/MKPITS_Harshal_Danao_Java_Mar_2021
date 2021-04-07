#include<stdio.h>
#include<conio.h>
int main()
{
	char name[20];
	printf("enter your name");
	scanf("%s",&name);
	printf("\nyour name is %s",name);
	printf("\nenter your name");
	fflush(stdin);
	gets(name);
	printf("your name is %s",name);
}
