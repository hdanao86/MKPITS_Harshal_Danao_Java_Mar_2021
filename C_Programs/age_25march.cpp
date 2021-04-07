/*wap to accept age from the user and display wheter he is eligible to vote or not*/
#include<stdio.h>
int main()
{
	int age;
	printf("enter the age");
	scanf("%d",&age);
	if(age>=18)
	printf("\n he is eligible to vote");
	else
	printf("\n he is not eligible to vote");

}
