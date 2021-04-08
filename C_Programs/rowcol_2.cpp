#include<stdio.h>
int main()
{
	int num[2][2];
	int row,col;
	num[0][0]=10;
	num[0][1]=20;
	num[1][0]=30;
	num[1][1]=40;
	for(row=0;row<2;row++)
	{
		for(col=0;col<2;col++)
		{
			printf("%d\t",num[row][col]);
		}
		printf("\n");
	}
}
