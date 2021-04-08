#include<stdio.h>
int main()
{
	int num[3][3];
	int row,col;
	num[0][0]=1;
	num[0][1]=2;
	num[0][2]=3;
	num[1][0]=4;
	num[1][1]=5;
	num[1][2]=6;
	num[2][0]=7;
	num[2][1]=8;
	num[2][2]=9;
	for(row=0;row<3;row++)
	{
		for(col=0;col<3;col++)
		{
			printf("%d\t",num[row][col]);
		}
		printf("\n");
}
			
		}

