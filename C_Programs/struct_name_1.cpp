#include<stdio.h>
#include<conio.h>
#include<string.h>
struct employee
{
	char name[20];
	char gender;
	int age;
};
int main()
{
	struct employee emp1;
	strcpy(emp1.name,"harshal");
	emp1.gender='m';
	emp1.age=22;
	printf("\n name=%s",emp1.name);
	printf("\n gender=%c",emp1.gender);
	printf("\n age=%d",emp1.age);
}

