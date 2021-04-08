#include<stdio.h>
int main()
{
	int sub,total=0;
	int cnt;
	float per;
	for(cnt=1;cnt<=5;cnt++)
	{
		printf("enter marks : ");
		scanf("%d",&sub);
		total = total + sub;
	}
	printf("\ntotal marks = %d",total);
	per = (total / 500.0f) * 100.0f;
	printf("\nper = %f",per);
	if(per >=90 && per <= 100)
	{
		printf("\ngrade : Distinction");
	}
	else if(per >=75 && per < 90)
	{
		printf("\ngrade : first");
	}
	else if(per > 40 && per <= 35)
		printf("\ngrade : second");
	else
	{
		printf("\n fail");
	}
}
