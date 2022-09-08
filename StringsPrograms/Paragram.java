
import java.util.Scanner;
public class Paragram
{
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string");
		String s = sc.nextLine().toLowerCase();

		if(pangram(s)==true)
			System.out.println("Pangram...");     
		else
			System.out.println("Not Pangram");
		
		sc.close();
	}

	public static boolean pangram(String s1) {
        
		int arr[]= new int[128];

		for(int i=0;i<s1.length();i++) {
			arr[Character.toLowerCase((s1.charAt(i)))]++;
		}

		for(int i=97;i<123;i++) {
			if(arr[i]==0)     
				return false;
		}
		return true;
	}
}