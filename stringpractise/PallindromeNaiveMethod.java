package stringpractise;

public class PallindromeNaiveMethod {

	public static void main(String[] args) {
		String str = "BA";
		if(Pallindrome(str)==true)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
	public static boolean Pallindrome(String str)
	{
		StringBuilder  rev = new StringBuilder(str);
		rev.reverse();
		return str.equals(rev.toString());
	}

}
