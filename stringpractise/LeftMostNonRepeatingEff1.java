package stringpractise;

import java.util.Arrays;

public class LeftMostNonRepeatingEff1 {

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
		
		Arrays.fill(arr, -1);
		for(int i=0;i<str.length();i++) {
			if(arr[str.charAt(i)]==-1)
				arr[str.charAt(i)]=i;
			else
				arr[str.charAt(i)]=-2;
		}
		int res=Integer.MAX_VALUE;
		for(int i=0;i<256;i++) {
			if(arr[i]>=0) {
				res=Math.min(res, arr[i]);
			}
		}
		return (res==Integer.MAX_VALUE)?-1:res;
		
	}

}
