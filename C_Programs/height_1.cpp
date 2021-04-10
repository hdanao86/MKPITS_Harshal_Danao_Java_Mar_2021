//1 Write a C program to accept the height of a person in centimeter and 
//categorize the person according to their height.
#include<stdio.h>
int main()
{
	float height;
	printf("enter  person height : ");
	scanf("%f",&height);
	if(height < 150.0f)
	printf("\n person is small");
	else if(height >= 150.0f && height < 165.0f)
	printf("\n person is average height");
	else if(height >= 165.0f && height <= 195.0f)
	printf("\n person is tall");
	else
		printf("\n abnormal height");		
}

