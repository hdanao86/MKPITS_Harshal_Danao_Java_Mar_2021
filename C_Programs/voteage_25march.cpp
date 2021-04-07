/*- wap to accept age from the user and display whether he is young, middleaged or old.(if elseif )*/
#include<stdio.h>
int main()
{
	int age;
	printf("enter the age");
	scanf("%d",&age);
	if(age>=18 && age<=25)
	printf("\n he is young");
	else if (age>=25 && age<=60)
	printf("\n he is middleaged");
else
    printf("\n he is old");	

}
