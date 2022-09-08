package stringpractise;

import java.util.Scanner;

public class ReverseWordsString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String...");

		String s = sc.nextLine();
		
		char []ch=s.toCharArray();
		
		reverseWord(ch,ch.length);
		
		String ss = new String(ch);
		System.out.println(ss);
	}
	
	public static void reverseWord(char ch[],int n)
	{
		int start =0;
		for(int end =0;end<n;end++) {
			if(ch[end]==' ')
			{
				if(ch[end+1]==' ')
					continue;
				reverse(ch, start, end-1);
				start = end+1;
			}
		}
		reverse(ch, start, n-1);
		reverse(ch, 0, n-1);
		
	}
	public static void reverse(char ch[],int s,int e)
	{
		while(s<=e)
		{
			char temp =ch[s];
			ch[s] = ch[e];
			ch[e] = temp;
			s++;
			e--;
		}
	}

}
