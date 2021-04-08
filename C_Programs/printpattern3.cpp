/* wap to print the pattern as given below
	1	2	3	
	1	2
	1
*/
#include<stdio.h>
int main()
{
	int rowcount,coloumncount;
	for(rowcount=3;rowcount>0;rowcount--)
	{
		for(coloumncount=1;coloumncount<=rowcount;coloumncount++)
		{
			printf("%d\t",coloumncount);
		}
		printf("\n");
	}
}
