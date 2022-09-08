package stringpractise;

public class SubSequenceString {

	public static void main(String[] args) 
	{
		String str1="hellohoware";
		
		String str2="hwoe";
		
		if(subsequence(str1,str2)==true) {
			System.out.println(str2+" is a subsequence of "+str1);
		}
		else
			System.out.println(str2+" is not a subsequence of "+str1);
	}
	
	public static boolean subsequence(String str1,String str2) {
		int i=0,j=0;
		if(str2.length()>str1.length())   //length of subsequence string can be larger than string 
			return false;
		while(i<str1.length() && j<str2.length()) {
			if(str1.charAt(i)==str2.charAt(j))
				j++;
			i++;             
		}
		return (j==str2.length());
	}
}
