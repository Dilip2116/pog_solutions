package stringpractise;

public class LeftMostNonRepeating {

	public static void main(String[] args) {
		String str = "GEEKSFORGEEKSK";
		
		if(leftmostNonRepeat(str)==-1) {
			System.out.println("No Nonrepeating letter");
		}
		else {
			System.out.println("index of leftmost Nonrepeating character .."+leftmostNonRepeat(str));
		}
	}
	
	public static int leftmostNonRepeat(String str) {
		int []arr = new int[256];
		
		for(int i=0;i<str.length();i++) {
			arr[str.charAt(i)]++;
		}
		
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)]==1)
				return i;
		}
		return -1;
		
	}

}
