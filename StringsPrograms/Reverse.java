import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String...");
		
		String s = sc.nextLine();
		
		char target[]= new char[s.length()];
		
		for(int i=0;i<s.length();i++) {
				target[i]=s.charAt(i);
		}
		
		
		
		
		
		reverse_words(target,0,target.length-1);
		
		
		String str="";
		for(int i=0;i<target.length;i++) {
			str+=target[i];
			
		}
		System.out.println(str);
		
				
		
	}
	
	public static void reverse_words(char str[],int start ,int end) {
		int w_start,w_end;
		for(w_start=w_end=start;w_end<=end;w_end++) {
			if(str[w_end]==' ') {
				continue;
			}
			w_start=w_end;
			while(str[w_end]!=' ' && w_end<end)
				w_end++;
			if(w_end!=end)
				w_end--;
			reverse(str,w_start,w_end);
		}
	}
	public static void reverse(char str[],int start ,int end) {
		char temp;
		while(start<=end) {
			temp = str[end];
			str[end]=str[start];
			str[start]=temp;
			start++;
			end--;
		}
	}

}
