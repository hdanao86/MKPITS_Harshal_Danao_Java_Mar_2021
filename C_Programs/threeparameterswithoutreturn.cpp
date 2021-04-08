#include<stdio.h>
int calculate(int n1,int n2,char ch)
{
	float res;
    if (ch=='+')
    {
    	res=(float)n1+n2;
	}
	else if (ch=='-')
	{
		res=(float)n1-n2;
	}
	else if(ch=='*')
	{
		res=(float)(n1/n2);
	}
	else
	{
		printf("\nenter character is invalid");
	}
}
int main()
{
	int n1,n2;
	float res;
	char ch;
	printf("\nenter 2 numbers : ");
	scanf("%d%d",&n1,&n2);
	printf("\nenter the charcter +,-,*,/ : ");
	fflush(stdin);
	scanf("%c",&ch);
	res=(float)calculate(n1,n2,ch);
	printf("\nTotal of 2 number is : %f",res);
}

