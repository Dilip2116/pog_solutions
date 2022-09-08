import java.util.Scanner;
public class Anagram2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.println("Enter two String..");
		StringBuffer s1=new StringBuffer(sc.nextLine());
		StringBuffer s2=new StringBuffer(sc.nextLine());

		if(isAnagram(s1,s2)==true) {
			System.out.println("Two String are in Anagram..");
		}
		else
		{
			System.out.println("Two Strings ae Not Anagram..");
		}



	}
	public static  boolean isAnagram(StringBuffer string1, StringBuffer string2) {
		if (string1.length() != string2.length()) {
			return false;
		}
		char ch;

		for (int i = 0; i < string1.length(); i++) {
			for(int j=i+1;j<string1.length();j++) {
				if(string1.charAt(i)>string1.charAt(j))
				{
					ch=string1.charAt(i);
					string1.setCharAt(i,string1.charAt(j));
					string1.setCharAt(j, ch);
				}

				if(string2.charAt(i)>string2.charAt(j))
				{
					ch=string2.charAt(i);
					string2.setCharAt(i,string2.charAt(j));
					string2.setCharAt(j, ch);
				}

			}
			if(string1.charAt(i)!=string2.charAt(i))
			{
				return false;
			}

		}
		return true;

	}

}
