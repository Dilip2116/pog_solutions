import java.util.Scanner;

public class  RemoveAllSpaceFromString{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String ");
		String str =new String(sc.nextLine());
		String s="";        


		int c=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{  c++;
				continue;
			}
			else
				s+=str.charAt(i);

		}
		String s1="";
		for(int i=1;i<=c;i++) {
			s1+=" ";
		}
		System.out.println(s1+s);

	}

}
