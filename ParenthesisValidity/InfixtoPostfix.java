import java.util.Stack;

public class InfixtoPostfix {

	public static void main(String[] args) {
		CharStack cstack = new CharStack();

		String infix =  "x+y*z"; //A+BC*+DE* //A+BC*DE*+ //ABC*DE*++

		String postfix =infix_to_postfix(infix, cstack);

		System.out.println(postfix);
		
		String infix1 =  "x+y/z-w*u"; //A+BC*+DE* //A+BC*DE*+ //ABC*DE*++

		String prefix =infix_to_prefix(infix1, cstack);
		
		System.out.println(prefix);

		
		int res = eval_post(postfix);
		
		System.out.println(res);
	}

	public static int prec(char symbol) {

		switch(symbol) {

		case '(' :return 0;


		case '+':
		case '-':
			return 1;

		case '*':
		case '/':
		case '%' :
			return 2;
		case '^':
			return 3;
		default :
			return 0;
		}
	}

	public static String infix_to_postfix(String infix,CharStack cstack)
	{
		int i,p=0;
		char symbol,next;
		char post[]= new char[infix.length()+1];
		for(i=0;i<infix.length();i++) 
		{
			symbol =infix.charAt(i);
			if(symbol!=32) {
				switch(symbol) {
				case '(' :cstack.push(symbol); break;
				case ')' : 
					while((next=cstack.pop())!='(') {
						post[p++]=next;
						//	System.out.println(post[i]);
					}
					break;
				case '+':
				case '-':
				case '*':
				case '/':
				case '%' :
				case '^':
					while(!cstack.isempty() &&  prec(cstack.peek())>=prec(symbol))
					{
						post[p++]=cstack.pop();
					}
					cstack.push(symbol);
					break;
				default:post[p++] =symbol;
				}
			}
		}
		while(!cstack.isempty())
		{
			post[p++]=cstack.pop();
		}
		String postfix = new String(post);
		return postfix;
	}

	public static int  pow(int n,int m) {
		int p=1;
		for(int i=1;i<=m;i++)
			p*=n;
		return p;
	}

	public static int eval_post(String post)
	{
		Stack<Integer> sstack = new Stack<>();
		int a=0,b=0;
		for(int i=0;i<post.length();i++)
		{
			if(post.charAt(i)>='0' && post.charAt(i)<='9') 
				
				sstack.push((post.charAt(i))-48);
			else
			{
				if(!sstack.isEmpty())
				{
					a=sstack.pop();
					b=sstack.pop();
				}
					
				switch(post.charAt(i))
				{
				case '+': sstack.push((b+a));
				break;

				case '-': sstack.push((b-a));
				break;

				case '*': sstack.push((b*a));
				break;
				case '/': sstack.push((b/a));
				break;

				case '%': sstack.push((b%a));
				break;

				case '^': sstack.push(pow(b, a));
				break;
				}
				//sstack.push(temp);
			}
		}

		return sstack.peek();
	}
	
	public static String infix_to_prefix(String infix,CharStack cstack)
	{
		int i,p=0;
		char symbol,next;
		char post[]= new char[infix.length()+1];
		for(i=infix.length()-1;i>=0;i--) 
		{
			symbol =infix.charAt(i);
			if(symbol!=32) {
				switch(symbol) {
				case ')' :cstack.push(symbol); break;
				case '(' : 
					while((next=cstack.pop())!=')') {
						post[p++]=next;
						//	System.out.println(post[i]);
					}
					break;
				case '+':
				case '-':
				case '*':
				case '/':
				case '%' :
				case '^':
					while(!cstack.isempty() &&  prec(cstack.peek())>prec(symbol))
					{
						post[p++]=cstack.pop();
					}
					cstack.push(symbol);
					break;
				default:post[p++] =symbol;
				}
			}
		}
		while(!cstack.isempty())
		{
			post[p++]=cstack.pop();
		}
		
		int start =0;
		int end =post.length-1;
		while(start<=end)
		{
			
			char temp=post[start];
			post[start]=post[end];
			post[end]=temp;
			start++;
			end--;
		}
		
		
		String prefix =new String(post);
		
		return prefix;
	}


}
