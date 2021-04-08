/* wap to print the pattern as given below
	*	
	*	*
	*	*	*
#include<stdio.h>
*/
#include<stdio.h>
int main()
{
	int rowcount,coloumncount;
	for(rowcount=1;rowcount<=3;rowcount++)
	{
		for(coloumncount=1;coloumncount<=rowcount;coloumncount++)
		{
			printf("*\t");
		}
		printf("\n");
	}
}
