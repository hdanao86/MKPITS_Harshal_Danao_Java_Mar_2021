/*Write a program in C to make such a pattern like right angle triangle with number increased by 1.
The pattern like :

   1
   2 3
   4 5 6
   7 8 9 10 */
   
    #include<stdio.h>
int main()
{
	int rowcount,coloumncount,res=1;
	for(rowcount=1;rowcount<=4;rowcount++)
	{
		for(coloumncount=1;coloumncount<=rowcount;coloumncount++)
		{
		printf("%d\t",res++);
		}
	printf("\n");
	}
}
