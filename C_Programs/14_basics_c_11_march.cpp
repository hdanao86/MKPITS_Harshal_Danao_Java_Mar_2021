#include<stdio.h>
#include<conio.h>
int main()
{
	int radius,area,circumference;
	printf("enter the radius");
	scanf("%d",&radius);
	area=3.14f*radius*radius;
	printf("area of circle = %d",area);
	circumference=2*3.14f*radius;
	printf("circumference of circle = %d",circumference);
}
