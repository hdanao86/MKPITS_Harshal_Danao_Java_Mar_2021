//3 Write a C program to read roll no, name and marks of three subjects and 
//calculate the total, percentage and division
#include<stdio.h>
int main()
{
	int roll_no,m1,m2,m3,total;
	char name[20];
	float avg,per;
	printf("enter roll number");
	scanf("%d",&roll_no);
	printf("enter student name");
	scanf("%s",&name);
	printf("enter marks 1 ::");
	scanf("%d",&m1);
	printf("enter marks 2 :");
	scanf("%d",&m2);
	printf("enter marks 3 :");
	scanf("%d",&m3);
	total=m1+m2+m3;
	avg=total/3.0f;
	per=(total/300.0f)*100.0f;
	printf("\n student roll number = %d",roll_no);
	printf("\n marks 1 = %d",m1);
	printf("\n marks 2 = %d",m2);
	printf("\n marks 3 = %d",m3);
	printf("\n total marks = %d",total);
	printf("\n Average marks = %f",avg);
	printf("\n percentage = %f",per);
	if(per >= 90 && per <=100)
	{
		printf("\n Division : Distinction");
	}
	else if(per > 80 && per < 90){
	printf("\n Division : First");
	}
	else if(per > 70 && per < 80)
	{
		printf("\n Division : Second");
	}
	else
	{
		printf("\n fail");
	}
}
