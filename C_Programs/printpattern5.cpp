/* wap to print the pattern given below
	1
	1	3	
	1	3	5
*/
#include<stdio.h>
int main()
{
	int rowcount,coloumncount,num=1;
	for(rowcount=1;rowcount<=3;rowcount++)
	{
		num=num+2;
		for(coloumncount=1;coloumncount<num;coloumncount=coloumncount+2)
		{
			printf("%d\t",coloumncount);
		}
		printf("\n");
	}
}
