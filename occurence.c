/*Write a program to accept a string from user. Display
each character of the string ,in order of its apperance,seperated by comma.Along
with each char display the  number of times the char has appeared in the string
*/


#include<stdio.h>


int main()
{
	int i,arr[128]={0},max;
	char ch,s[20];
	int n=sizeof(arr)/sizeof(arr[0]);
	
	printf("\n Enter a String");
	gets(s);
	
	printf("String is :- %s\n",s);
	
//	for(i=0;i<=n;i++)
//	{
//		printf("%d ,",arr[i]);
//	}
	
	printf("\nOccurence of Characters :- \n");
	for(i=0;s[i]!='\0';i++)
	{
		ch=s[i];
		if((ch>=65) &&(ch<=90))
		{
			ch=ch+32;
		}
		if((ch>=97) && (ch<=122) || (ch>=48) && (ch<=59) ||(ch==32))
	
		{
			arr[ch]++;
		}
		
	}
	
	for(i=0;s[i]!='\0';i++)
	{
		ch=s[i];
		if((ch>=65) &&(ch<=90))
		{
			ch=ch+32;
		}
		if(arr[ch]!=0)
	
		{
			if(ch==32)
				printf("space - %d ,",arr[ch]);
			else
				printf("%c - %d ,",ch,arr[ch]);
				
			arr[ch]=0;
		}
		
	}
	
	
	return 0;
}
