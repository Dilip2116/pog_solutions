package stringpractise;

import java.util.Arrays;

public class LeftMostRepeatingLetterEff2RightToLeftTraverse {

	public static void main(String[] args) {

		String str = "bbddddwwa";
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
		
		Arrays.fill(arr, -1);
		int r=Integer.MAX_VALUE;

		for(int i=0;i<str.length();i++) {
			int inf = arr[str.charAt(i)];
			
			if(inf==-1) //when character of string is not visited...
				arr[str.charAt(i)]=i;
			else  //when character of string is visited once..........
				r=Math.min(r,inf);
		}
		return (r==Integer.MAX_VALUE)?-1:r;
	}

}
