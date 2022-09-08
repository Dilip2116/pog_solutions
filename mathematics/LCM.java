package mathematics;

public class LCM {

	public static void main(String[] args) {
		System.out.println("LCM : "+LCM_eff(4,6));
		System.out.println("LCM : "+LCM_naive(4,6));

		
	}
	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	public static int LCM_eff(int a,int b)   //Time Complexity = O(log(min(a,b));
	{
		return (a*b/gcd(a,b));
	}
	
	public static int LCM_naive(int a,int b)
	{
		int res=Math.max(a, b);
		while(true)
		{
			if(res%a==0 && res%b==0)
				return res;
			res++;
		}
		
	}
}
