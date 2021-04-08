//wap to do transpose of a 3x3 matrix
#include<stdio.h>
int main()
{
	int mat1[3][3];
	int mat2[3][3];
	int i,j;
	
	//input characters for matrix
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
		printf("\n Enter any number :");
		scanf("%d",&mat1[i][j]);
	}
}
//print matrix 1
printf("\n enter number matrix :\n");
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		printf("%d\t",mat1[i][j]);
	}
	printf("\n");
}
//transpose of a matrix
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		mat2[j][i]=mat1[i][j];
	}
}
//print transpose of  matrix 2
printf("\n transpose of above matrix is : \n");
for(i=0;i<3;i++)
{
	for(j=0;j<3;j++)
	{
		printf("%d\t",mat2[i][j]);
	}
	printf("\n");

}
}
