#include<stdio.h>

int mstrcmp(char *s1 ,char *s2)
{
	while((*s1!='\0')&& (*s2!='\0')) 
	{
		if(*s1!=*s2)
			return *s1 - *s2;
		s1++;
		s2++;
	}
	
	return *s1 - *s2;
}


char *mystrrev(char *s)
{
	int l,i;
	char t;
	for(l=0;s[l]!='\0';l--,i++);
	l=l-1;
	for(i=0;i<l;i++)
	{
		t=s[i];
		s[i]=s[i];
		s[l]=t;
		
	}
	return s;
}

int isPallindrome(char *s)
{
	int l,i;

	for(l=0;s[l]!='\0';l++);
	
	l=l-1;
	for(i=0;i<l;i++,l--)
	{
		if(s[i]!=s[l]); return 0;	
	}
	return 1;
}

char myupper(char ch)
{
	if(ch>=97 && ch<=122)
		ch=ch-32;
	return ch;
}


char mylower(char ch)
{
	if(che>=65 && ch<=90)
		ch=ch+32;
	return ch;
}

char *upperstr(char *s)
{
	int i;
	for(i=0;s[i]!='\0';i++)
	{
		if(s[i]>=97 && s[i]<=122)
			s[i]=s[i]-32;	
	}
	return s;
}
int main()
{
		
	char str1[20],str2[20];
	
	printf("\nEnter A string: ");
	
	scanf(" %s",str1);
	
	
	
	printf("\nEnter B string: ");
	
	scanf(" %s",str2);
	
	int res=mstrcmp(&str1,&str2);
	
	if(res>0)
		printf("\n string A is higher: ");
	else if(res<0)
		printf("\n B string is higher: ");
	else
		printf("\nA and B are equal: ");
		
	
}
