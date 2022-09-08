package stringpractise;

public class SubSequenceStringRecursive {

	public static void main(String[] args) {

		String str1="GEEKSFORGEEKS";
		String str2="GREES";
		int m=str2.length();
		int n=str1.length();
		if(subsequence(str1,str2,n,m)==true) {
			System.out.println(str2+" is a subsequence of "+str1);
		}
		else
			System.out.println(str2+" is not a subsequence of "+str1);
	}
	
	public static boolean subsequence(String str1,String str2,int n,int m) {
		
		if(m==0)  // all character of s2 in sequence 
			return true;
		if(n==0)
			return false;
		if(str2.charAt(m-1)==str1.charAt(n-1))  // if s2 char is match in s1 then both index is --
			return subsequence(str1, str2, n-1, m-1);
		else
			return subsequence(str1, str2, n-1, m);    //if not matched then only str1 is --;
	}
}
