#include<stdio.h>
calculatefactorial(int num)
{
	int fact=1;
	do
	{
		fact=fact*num;
		num--;
	}
	while(num!=0);
}
int main()
{
	int num,res;
	printf("enter number");
	scanf("%d",&num);
	res=calculatefactorial(num);
	printf("\nfactorial of %d is : %d",num,res);
}
