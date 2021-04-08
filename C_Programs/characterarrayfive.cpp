/*- wap to create  a character array of 5 elements
accept 5 characters from the user 
and then display each character in a new line.
then search in an array whether a vowel character is present in it or not
*/
#include<stdio.h>
int main()
{
	char ch[5];
	int cnt;
	for(cnt=0;cnt<5;cnt++)
	{
		printf("\n enter any character : ");
		scanf("%c",&ch[cnt]);
	}
	for(cnt=0;cnt<5;cnt++)
	{
		printf("\n Entered character %d = %c",cnt,ch[cnt]);
	}
	for(cnt=0;cnt<5;cnt++)
	{
		if(ch[cnt]=='a')
		{
		printf("\n character %c is a vowel",ch[cnt]);
		}
		else if(ch[cnt]=='e')
		{
			printf("\n character %c is a vowel",ch[cnt]);
		}
		else if(ch[cnt]=='i')
		{
			printf("\n character %c is a vowel",ch[cnt]);
		}
		else if(ch[cnt]=='k')
		{
			printf("\n character %c is not a vowel",ch[cnt]);
		}
		else if(ch[cnt]=='t')
		{
			printf("\n character %c is not a vowel",ch[cnt]);
		}
}
}
