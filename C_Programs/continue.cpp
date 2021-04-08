/*continue statement */
/*1- wap to print no. from 1 to 20 except 13 using continue statement.*/
#include<stdio.h>
int main()
{
	int cnt;
	for(cnt=1;cnt<=20;cnt++)
	{
		if(cnt==13)
		{
			continue;
		}
		printf("%d\n",cnt);
	}
}
