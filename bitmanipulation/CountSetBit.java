package bitmanipulation;
import java.util.Scanner;

public class CountSetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		int c=0;
		int t=n;
		while(n>0) { 
		 // if n & 1 ==1 then last bit of  n is 1.....
			c+=(n&1);
			n=n>>1;
		}
		System.out.println("Total set bit in "+t+" is "+c);

	}

}
