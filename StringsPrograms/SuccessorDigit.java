
import java.util.Scanner;
public class SuccessorDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter String ");
		String str = sc.nextLine();
		char s[]= new char[str.length()];

		for(int i=0;i<str.length();i++) {
			s[i]=str.charAt(i);
		}                                       //   this 5dm
		
		String res ="";
		for(int i=1;i<s.length;i++) {
			if(s[i]>=48 && s[i]<=57) {
				if((s[i-1]!=' ') && (s[i-1]>='A' && s[i-1]<='Z')||( s[i-1]>='a' && s[i-1]<='z'))
					res+=s[i-1]+" ";
				}
			}
		System.out.println(res);
	}
	

}
