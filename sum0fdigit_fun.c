#include<stdio.h>
int sumof_digit(int n)
{
	int sum=0;
	while(n/10!=0)
	{
		sum=0;
		 while(n!=0)
		 {
		 sum+=n%10;
		 n/=10;
		}
		n=sum;	
	}
	return sum;
}
int main()
{
	int num;
	printf("Enter a number:--");
	scanf("%d",&num);
	printf("Sum of digit till reduced to single digit:-- %d",sumof_digit(num));
	return 0;
}
