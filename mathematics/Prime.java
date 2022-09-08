package mathematics;

public class Prime {

	public static void main(String[] args) {
		if(prime(121))
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
	}
	
	public static boolean prime(int n)
	{
		if(n==1) return false;
		if(n==2|| n==3) return true;
		if(n%2==0|| n%3==0) return true;
		for(int i=5;i*i<=n;i=i+6)
		{
			if(n%i==0 || n%(i+2)==0)
				return false;
		}
		return true;
	}

}
