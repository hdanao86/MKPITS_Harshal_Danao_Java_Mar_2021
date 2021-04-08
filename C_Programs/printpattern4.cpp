/* wap to print the pattern as given below
	1	3	5	
	1	3	5
	1	3	5
*/
#include<stdio.h>
int main()
{
	int rowcount,coloumncount,num=2;
	for(rowcount=1;rowcount<=3;rowcount++)
	{
		for(coloumncount=1;coloumncount<=5;coloumncount=coloumncount+2)
		{
			printf("%d\t",coloumncount);
		}
		printf("\n");
	}
}

