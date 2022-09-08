package stringpractise;

public class LeftMostRepeatingLetter {

	public static void main(String[] args) {

		String str = "bcaddddwwa";
		if(leftmostRepeat(str)==-1) {
			System.out.println("No repeating letter");
		}
		else {
			System.out.println("index of leftmost repeating character .."+leftmostRepeat(str));
		}
	}
	//Time Complexity is linear that is O(n)....
	//Naive Approach TC is O(n*n) ...required two loops...
	public static int leftmostRepeat(String str) {
		int arr[] = new int[256];
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
			}
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)]>1)
				return i;
		}
		return -1;
	}

}
