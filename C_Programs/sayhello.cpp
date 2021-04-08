/*2 - create a function sayhello to print "hello to c programming" and call this function from main function.*/
#include<stdio.h>
void sayhello()
{
	printf("\n hello to c programming");
	printf("\n c is a programming language");
	printf("\n we can create functions in c programming");
}
int main()
{
	sayhello();
	printf("\n back to main function");
	sayhello();
	printf("\n back to main function");
}
