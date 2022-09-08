package bitmanipulation;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		while(n>0)
		{
			if((n&1)==1) {
				System.out.println("ODD");
				return;
			}
			else {
				System.out.println("Even");
			}
		}
	}

}
