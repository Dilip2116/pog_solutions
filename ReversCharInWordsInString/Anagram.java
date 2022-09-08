import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two String..");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		if(isAnagram(s1,s2)==true) {
			System.out.println("Two String are in Anagram..");
		}
		else
		{
			System.out.println("Two Strings ae Not Anagram..");
		}
		
		

			}
	public static  boolean isAnagram(String string1, String string2) {
	    if (string1.length() != string2.length()) {
	        return false;
	    }
	    int count[] = new int[128];
	    for (int i = 0; i < string1.length(); i++) {
	        count[string1.charAt(i)]++;
	        count[string2.charAt(i)]--;
	    }
	    for (int i = 0; i < count.length; i++) {
	        if (count[i] != 0) {
	            return false;
	        }
	    }
	    return true;
	}

}
