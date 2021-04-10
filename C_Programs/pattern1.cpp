/*Write a program in C to display the pattern like right angle triangle using an asterisk.
	The pattern like :

*
**
***
**** 
*/

#include<stdio.h>
int main()
{
	int rowcount,coloumncount;
	for(rowcount=1;rowcount<=4;rowcount++)
	{
		for(coloumncount=1;coloumncount<=rowcount;coloumncount++)
		{
		printf("*\t");
		}
	printf("\n");
	}
}
