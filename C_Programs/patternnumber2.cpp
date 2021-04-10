/*Write a program in C to display the pattern like right angle triangle with a number.
The pattern like :

1
12
123
1234 */

#include<stdio.h>
int main()
{
	int rowcount,coloumncount;
	for(rowcount=1;rowcount<=4;rowcount++)
	{
		for(coloumncount=1;coloumncount<=rowcount;coloumncount++)
		{
		printf("%d\t",coloumncount);
		}
	printf("\n");
	}
}
