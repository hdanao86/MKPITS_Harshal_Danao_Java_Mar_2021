#include<stdio.h>
#include<conio.h>
int main()
{
	int length,breadth,height,volume;
	printf("enter the length");
	scanf("%d",&length);
	printf("enter the breadth");
	scanf("%d",&breadth);
	printf("enter the height");
	scanf("%d",&height);
	volume=length*breadth*height;
	printf("volume = %d",volume);
}
