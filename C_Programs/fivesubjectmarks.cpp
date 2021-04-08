#include<stdio.h>
int main()
{
	int sub,total=0;
	int cnt;
	for(cnt=1;cnt<=5;cnt++)
	{
		printf("enter marks : ");
		scanf("%d",&sub);
		total=total+sub;
	}
	printf("\ntotal marks = %d",total);
}
