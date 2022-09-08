//sum of digit of number unitl the sum is reduced to single digit:--
#include<stdio.h>
int main()
{
	int num,sum;
	printf("Enter a number:--");
	scanf("%d",&num);
	while(num/10!=0)
	{
		sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num=num/10;
				
		}
	num=sum;
	}
	printf("Sum=%d",sum);
	return 0;
}
