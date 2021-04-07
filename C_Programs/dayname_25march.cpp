/*- WAP TO ACCEPT DAYNO AND PRINT DAYNAME USING IF ELSE IF..*/
#include<stdio.h>
int main()
{
	int dayno;
	printf("enter the dayno betwen 1 to 7");
	scanf("%d",&dayno);
if (dayno == 1)
{
	printf("\n monday");
}
    else if (dayno == 2)
    {
	printf("\n tuesday");
 }
	else if(dayno == 3)
	{
	printf("\n wednesday");
}
	else if(dayno == 4)
	{
	printf("\n thursday");
}
	else if(dayno == 5)
	{
	printf("\n friday");
}
	else if(dayno == 6)
	{
	printf("\n saturday");
}
	else if(dayno == 7)
	{
	printf("\n sunday");
}
else
    printf("\n invalid day");	
}

