package bitmanipulation;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long n= sc.nextInt();
		

		long bin =0;
		int i=0;
		while(n>0) {  //bin =1  bin =1 bin 1*100+1 =101
			long bit = n&1;
			
			bin = bit*pow(10,i++)+bin;  
			
			n>>=1;  //n=n>>1
		}
		System.out.println(bin);
	}
	public static int pow(int n,int i) {
		int p=1;
		while(i>0) {
			p*=n;
			i--;
		}
		return p;
	}
}
