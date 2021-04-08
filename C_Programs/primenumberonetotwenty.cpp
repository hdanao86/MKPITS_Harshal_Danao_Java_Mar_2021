// wap to print prime no between 1 and 20
#include<stdio.h>
int main()
{
	int num=2, cnt,rem;
	for(cnt=1;cnt<=20;cnt++)
	{
		rem=cnt%num;
		if(rem==0)
		{
			printf("\n %d",cnt);
		}
	}
	return 0;
	}
