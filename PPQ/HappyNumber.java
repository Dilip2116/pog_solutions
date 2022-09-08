import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		if(happyNumber(n))   
			System.out.println("Happy Number");
		else
			System.out.println("Not Happy Number");
		
	}
	
	public static int getSquare(int n)
	{
		int sum=0;
		while(n>0)
		{
			sum+=(n%10)*(n%10);
			n/=10;
		}
		return sum;
	}
	
	public static boolean happyNumber(int n)
	{
		int slow = n;
		int fast =getSquare(n);
		while(fast!=1 && slow!=fast)
		{
			slow=getSquare(slow);
			fast=getSquare(getSquare(fast));
		}
		return fast==1;
	}

}
