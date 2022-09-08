import java.util.Scanner;

public class TruncateSpace {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String ");
		String str =new String(sc.nextLine());
		char s[]= new char[str.length()];

		for(int i=0;i<str.length();i++) {
			s[i]=str.charAt(i);
		}

		String s1="";
		for(int i=0;i<s.length;i++)
		{
			if(s[i]==' ')
			{
				if(s[i+1]==' ')
				{
					continue;
				}

				System.out.print(s[i]);
			}
			else
			{
				System.out.print(s[i]);
			}




		}




	}

}
