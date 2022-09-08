#include<Stdio.h>
void print_arr(int arr[],int s)
{
	int i;
	for(i=0;i<s;i++)
	{
		printf("%d ",arr[i]);
	}
	printf("\n");
}
void input_arr(int arr[],int s)
{
	int i;
	for(i=0;i<s;i++)
	{
		scanf("%d",&arr[i]);
	}
}
void left_rotate(int arr[],int s,int n)
{
	int i,j;
	int temp;
	for(j=0;j<n;j++)
	{
		temp=arr[0];
		for(i=0;i<s-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=temp;	
	}
}

void right_rotate(int arr[],int s,int n)
{
	int i,j;
	int temp;
	for(j=0;j<n;j++)
	{
		temp=arr[s-1];
		for(i=s-1;i>=1;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[i]=temp;
	}
}
int main()
{
	int size=10,n,ans; 
	int array[size],start=0,end=size-1;
	printf("Enter %d numbers:- ",size);
	input_arr(array,size);
	printf("\nGiven Array is :- ");
	print_arr(array,size);
	printf("\n In which direction you want to rotate an array :\nPress 1 to rotate Left direction :\nPress 0 to rotate Right direction :");
	scanf("%d",&ans);
	if(ans==1)
	{
		printf("\nNumber of times you want left rotate an array : ");
		scanf("%d",&n);
		left_rotate(array,size,n);
		printf("\nArray after %d times of left rotate is: ",n);
	}
	else
	{
		printf("\nNumber of times you want left rotate an array : ");
		scanf("%d",&n);
		right_rotate(array,size,n);	
		printf("\nArray after %d times of Right rotate is: ",n);
	}
	print_arr(array,size);
	return 0;
}
