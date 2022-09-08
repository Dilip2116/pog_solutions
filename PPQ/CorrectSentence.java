import java.util.*;
import java.lang.*;
import java.io.*;

public class CorrectSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// your code goes here
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		while(n-->0)
		{
			int k = sc.nextInt();
			String s = sc.nextLine();
			String str[] =s.split(" ");
			int f1=1;
			for(int j=0;j<str.length;j++)
			{
				int c1=0,c2=0,ext=0;
				for(int i=0;i<str[j].length();i++)
				{
					if(str[j].charAt(i)>='a' && str[j].charAt(i)<='m')
						c1++;
					else if(str[j].charAt(i)>='N' && str[j].charAt(i)<='Z')
						c2++;

					else
						ext++;
				}
				if(ext>0 || (c1>0 && c2>0))
				{
					f1=0 ;
					System.out.println("NO");
					break;
					
				}
		}
		if(f1==1)
			System.out.println("YES");
	}

}

}


/*3
1 aN
2 ab NO
3 A N D
 */