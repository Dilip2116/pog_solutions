package stringpractise;

import java.util.Scanner;

public class isogram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s=sc.next();
		if(iSogram(s)==true)
			System.out.println("Given string is an  isogram");
		else 
			System.out.println("Given string is not an isogram");
		
	}
	
	public static boolean iSogram(String str)
	{
		int []ch = new int[256];
		
		for(int i =0 ;i<str.length();i++)
		{
			ch[str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++)
		{
			if(ch[str.charAt(i)]>1)
				return false;
		}
		return true;
	}
}
