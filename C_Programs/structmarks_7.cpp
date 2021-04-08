#include<stdio.h>
#include<conio.h>
#include<string.h>
struct student
{
	int rollno;
	char name[20];
	int cnt;
	int total;
	float per;
	int marks1,marks2,marks3;
	
};
int main()
{
	struct student s1;
	printf("\nenter rollno");
	scanf("%d",&s1.rollno);
	printf("\nenter name");
	scanf("%s",&s1.name);
	
	printf("\nenter marks1");
	scanf("%d",&s1.marks1);
		printf("\nenter marks2");
	scanf("%d",&s1.marks2);
		printf("\nenter marks3");
	scanf("%d",&s1.marks3);
	
	printf("\n rollno : %d",s1.rollno);
	printf("\n name : %s",s1.name);
	printf("\n marks1 : %d",s1.marks1);
	printf("\n marks2 : %d",s1.marks2);
	printf("\n marks3 : %d",s1.marks3);
	s1.total=s1.marks1+s1.marks2+s1.marks3;
	printf("\n");
	printf("\ntotal=%d",s1.total);
	printf("\n");
	s1.per=(s1.total / 300)*100;
	printf("\npercentage=%f",s1.per);
	if(per>75 && per<=100)
	{
	printf("distinction");
}
	else if(per>60 && per<75)
	{
	printf("first class");
}
	else(per>50 && per<60)
	{
	printf("second class");
}
}
