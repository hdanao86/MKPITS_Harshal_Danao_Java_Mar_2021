/* wap to print the pattern as given below
	1	
	1	2
	1	2	3
using nested for loop.
*/
#include<stdio.h>
int main()
{
	int rowcount,coloumncount;
	for(rowcount=1;rowcount<=3;rowcount++)
	{
		for(coloumncount=1;coloumncount<=rowcount;coloumncount++)
		{
	printf("%d\t",coloumncount);
    }
    printf("\n");
}
}


