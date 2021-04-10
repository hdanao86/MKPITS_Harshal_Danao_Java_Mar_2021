/*4 Write a C program to read temperature in centigrade and display a suitable 
message
 according to temperature state below 
Temp < 0 then Freezing weather
Temp 0-10 then Very Cold weather
Temp 10-20 then Cold weather
Temp 20-30 then Normal in Temp
Temp 30-40 then Its Hot
Temp >=40 then Its Very Hot*/
#include<stdio.h>
int main()
{
	int temp;
	printf("enter temperature :");
	scanf("%d",&temp);
	if(temp < 0)
	{
		printf("\n Freezing wheather");
	}
	else if(temp >= 0 && temp < 10)
	{
		printf("\n very cold wheather");
	}
	else if(temp < 20)
	{
		printf("\n cold wheather");
	}
	else if(temp < 30)
	{
		printf("\n normal in temp");
	}
	else if(temp < 40)
	{
		printf("\n Its hot");
	}
	else
	{
		printf("\n Its very hot");
	}
}
