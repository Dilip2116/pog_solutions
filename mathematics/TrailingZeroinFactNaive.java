package mathematics;

public class TrailingZeroinFactNaive {

	public static void main(String[] args) {
		System.out.println("trailing zero " +countZero(50));
	}
	
	
	public static long countZero(long n)
	{
		long fact=1;
		for(int i=2;i<=n;i++)
			fact=fact*i;
	
		System.out.println(fact);
		int res=0;
		while(fact%10==0)
		{
			res++;
			fact=fact/10;
		}
		
		return res;
		
	}

}
