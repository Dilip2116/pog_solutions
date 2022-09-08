#include<stdio.h>
void print_arr(int arr[],int s)
{
	int i;
	for(i=0;i<s;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");
	
}
void read_arr(int arr[],int s)
{
	int i;
	for(i=0;i<s;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("\n");
	
} 
void frequency_arr(int *p,int s)
{
	int i,j;
	for(i=0;i<s;i++)
	{
		int c=1;
		for(j=i+1;j<s;j++)
		{
			if(p[i]==p[j])
			{
				c++;
			}
		}
		printf("\nFrequency of %d = %d",p[i],c);
	}
}
int main()
{
	int array[100],s;
	int *ptr=array;
	printf("\nEnter number of elements in  array u want:-");
	scanf("%d",&s);
	printf("\nEnter %d numbers:-",s);
	read_arr(array,s);
	printf("\nGiven array is:-");
	print_arr(array,s);
	frequency_arr(array,s);
	return 0;
}
