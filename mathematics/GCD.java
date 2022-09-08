package mathematics;

public class GCD {

	public static void main(String[] args) {
		
		System.out.println("GCD "+GCD_eff(12, 15));
		System.out.println("GCD "+GCD_naive(12, 15));
		
		
	}
	
	public static int GCD_eff(int a,int b)
	{
		if(b==0)
			return a;
		else
			return GCD_eff(b,a%b);
	}
	
	public static int GCD_naive(int a,int b)
	{
		int re=Math.min(a, b);
		while(re>0)
		{
			if(a%re==0 && b%re==0)
				break;
			re--;
		}
		return re;
	}

}
