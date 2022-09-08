package stringpractise;

public class PallindromeEfficientMethod {

	public static void main(String[] args) {
		String str = "LEVEl".toLowerCase();
		if(Pallindrome(str)==true)
			System.out.println("YES");
		else
			System.out.println("NO");      
	}
	public static boolean Pallindrome(String str)
	{
		int start = 0;
		int end = str.length()-1;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end))
				return false;
			start++;
			end--;
			}
		return true;
	}

	

}
