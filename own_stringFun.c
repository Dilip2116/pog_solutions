#include<stdio.h>
#include<conio.h>
int mystrlen(char *s)
{
	int i,len=0;

	for(i=0;s[i]!='\0';i++)
	{
		len+=1;
	}
	
	return len;
}

int mystrlen2(char *s)
{
	int i,len=0;
	for(i=0;s[i]!='\0';i++);
	
	return i;
}

//mystrcpy using only pointer ...

char *mystrcpy1(char *tar,char *source)
{
	char *t=tar;
	
	while(*tar++ == *source++)
	return t;
}
//Mystrcpy second version

char *mystrcpy(char *tar,char *source)
{
	int i;
	for(i=0;source[i]!='\0';i++)
		tar[i]=source[i];
	
	tar[i]='\0';
	return tar;
}

//myStrConcatenation..

char *mystrcat(char *tar,char *source)
{
	int i,j;
	
	for(i=0;tar[i]!='\0';i++);
	
	for(j=0;source[j]!='\0';i++,j++)
		tar[i]=source[j];
		
	
	tar[i]='\0';
	
	return tar;
}

//concate second version

char *mystrcat2(char *tar,char *source)
{
	char *t=tar;
	
	while(*tar!='\0') tar++;
	
//	while(*tar++ = *source++);   
	while(*source) //till second/source string is not empty..
		{
		*tar=*source  // this will store the base address of second at the end of first string..
		
		tar++;
		source++;
	}
	
	return t;
}

int main()
{
	int k = mystrlen("dilip\0");
	int l = mystrlen2("dilip\0");
	
		
	printf("%d %d",k,l);
	
	
	char str1[20],str2[20],str3[20];
	
	printf("\nEnter A string: ");
	
	scanf(" %s",str1);
	
	char *st=mystrcpy(str2,str1);
	
	printf("str2:- %s ",st);
	
	printf("\nEnter B string: ");
	
	scanf(" %s",str3);
	
	char *concat =mystrcat2(str1,str3);
	
	
	
		printf("Conctenation str1+str3 :- %s ",concat);
	return 0;
}
