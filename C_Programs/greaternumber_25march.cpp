/*- wap to accept 3 numbers from the user and display the greater numbers(if elseif ...)*/
#include<stdio.h>
int main()
{
	int n1,n2,n3;
	printf("enter first number");
	scanf("%d",&n1);
	printf("enter second number");
	scanf("%d",&n2);
	printf("enter third number");
	scanf("%d",&n3);
	if(n1>n2)
	printf("\n first number is greatest");
	else if (n2>n3)
	printf("\n second number is greatest");
	else
	printf("\n third number is greatest");

}
