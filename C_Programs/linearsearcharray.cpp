//wap to create array 10 elements accept 10 no. from the user and store it in an array
//then accept a no. from the user to search in an array.(linear search)
#include<stdio.h>
int main()
{
	int num[10];
	int cnt,notosearch;
	for(cnt=0;cnt<10;cnt++)
	{
		printf("\n Enter any number : ");
		scanf("%d",&num[cnt]);
	}
	printf("\n Enter number to search :");
	scanf("%d",&notosearch);
	for(cnt=0;cnt<10;cnt++)
	{
		printf("\n number %d is at position : %d",notosearch,cnt);
		break;
	}
	if(cnt==9)
	{
		printf("\n number is not in an array ");
	}
}
