/* -wap to create array 10 elements accept 10 no. from the user and store it in an array
then accept a no. from the user to search in an array.binary search.(accept the no. in ascendion order)
*/
#include<stdio.h>
int main()
{
	int num[10];
	int cnt,notosearch;
	int mid,high=9,low=0;
	for(cnt=0;cnt<10;cnt++)
	{
		printf("\n enter any number : " );
		scanf("%d",&num[cnt]);
	}
	printf("\n Enter the number to search : " );
	scanf("%d",&notosearch);
	
	while(low<=high)
	{
		mid=(low+high)/2;
		if(num[mid]==notosearch)
		{
			printf("\n number %d is at position : %d",notosearch,num[mid]);
			break;
		}
		else
		{
			if(num[mid]<notosearch)
			{
				low=mid+1;
			}
			if(num[mid]>notosearch)
			{
				high=mid-1;
			}
		}
		if(low>high)
		{
			printf("\n Number is not in an array ");
		}
	}
}
