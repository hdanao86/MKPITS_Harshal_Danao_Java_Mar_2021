#include<stdio.h>
void changevalue(int num)
{
	num=num+5;
	printf("\nvalue of num inside function=%d",num);
}
int main()
{
	int num=5;
	printf("value of num before passing to function=%d",num);
	changevalue(num);
	printf("\nvalue of num after calling the function=%d",num);
}
