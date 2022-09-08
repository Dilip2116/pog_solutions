package mathematics;

public class TrailingZeroFactEfficient {

	public static void main(String[] args) {
		
		System.out.println("trailing zeroes: "+countTrailingZeroes(50));
	}
	
	public static int countTrailingZeroes(int n)
	{
		int res=0;
		for(int i=5;i<n;i=i*5)
		{
			res=res+n/i;
		}
		
		return res;
	}

}


//TC = O(logn)