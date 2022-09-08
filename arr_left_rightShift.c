// left shifting on an array :----
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
void left_shift(int arr[],int s,int n)
{
	int i,j;
	for(j=0;j<n;j++)
	{
		for(i=0;i<s-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[i]=0;
	}
}
/*void right_shift(int arr[],int s)
{
	int i;
	for(i=s-1;i>1;i--)
	{
		arr[i]=arr[i-1];
	}
	arr[i-1]=0;
	
}*/
int main()
{
	int size=10,i,n; 
	int array[size];
	printf("Enter %d numbers : ",size);
	input_arr(array,size);
	printf("Given Array is :- ");
	print_arr(array,size);
	printf("\nNumber of times you want left shif an array : ");
	scanf("%d",&n);
	//printf("\nleft shift :-");
	left_shift(array,size,n);
	printf("\nArray after %d times of left shifting is: ",n);
	print_arr(array,size);
	return 0;
}

