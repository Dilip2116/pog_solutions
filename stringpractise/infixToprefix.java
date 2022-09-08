package stringpractise;

import java.util.Stack;

public class infixToprefix {

	public static void main(String[] args) {


		String infix = "x+y/z-w*u" ; // op :- -+/yz*wu

		System.out.println("Infix : "+infix+"\n");

		String pre = infix_to_prefix(infix);

		System.out.println("Prefix : "+pre+"\n");

		String prefix = pre_to_post(pre);

		System.out.println("Postfix : "+prefix+"\n");


		int result = eval_prefix("- + / 5 2 * 20 5 2");//^ 10 ^ 2 3

		System.out.println("Result of PreFix Expression \" + * 10 2 3 \" :  "+result+"\n");

	}

	public static int precedence(char symbol)
	{
		switch(symbol)
		{
		case '(':return 0;
		case '+':
		case '-':return 1;
		case '*':
		case '/':
		case '%':return 2;
		case '^':return 3;
		default :return 0;
		}
	}

	public static String infix_to_prefix(String infix) {   //   zyx+    *  --> *+xyz
		Stack<Character> cstack = new Stack<>();   //( x + y ) * z    //  * 
		String result="";

		for(int i=infix.length()-1;i>=0;i--) {
			char input=infix.charAt(i);
			if(input ==' ')
				continue;

			switch(input)
			{
			case ')':cstack.push(input); break;
			case '(':
				while(!cstack.isEmpty() && cstack.peek()!=')')
				{
					result+=cstack.pop()+" ";
				}
				break;

			case '+':
			case '-':
			case '*':
			case '/':
			case '%':
			case '^':
				////when we have operator in input then check the precendence of input with peek of stack if peek precedence is high/= then pop from stack 
				// and append that into result string else push input opertor into stack.....
				while(!cstack.isEmpty() && precedence(cstack.peek())>precedence(input))  

				{
					result+=cstack.pop()+" ";
				}
				cstack.push(input);
				break;
				//if the input is operand then directly append into the result string..
			default :result+=input+" ";
			}


		}

		while(!cstack.isEmpty())
		{
			result+=cstack.pop()+" ";
		}

		//

		char []ch =result.toCharArray();

		int start =0;
		int end =ch.length-1;
		while(start<=end)
		{

			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}


		String prefix =new String(ch);

		return prefix;

	}

	public static boolean isNumeric(String s)
	{
		try {
			Integer.parseInt(s);}
		catch(NullPointerException | NumberFormatException e) {
			return false;}
		return true;
	}
	public static int  pow(int n,int m) {
		int p=1;
		for(int i=1;i<=m;i++)
			p*=n;
		return p;
	}
	public static int eval_prefix(String postfix) //+ * 10 2 3  //23 
	{
		Stack<Integer> cstack = new Stack<>();

		String []oper = postfix.split(" ");

		for(int i=oper.length-1;i>=0;i--) {
			if(isNumeric(oper[i]))
			{
				int y = Integer.parseInt(oper[i]);
				cstack.push(y);
			}
			else
			{
				int op1=0,op2=0;
				if(!cstack.isEmpty()) {
					op1=cstack.pop();
					op2=cstack.pop();
				}
				switch(oper[i]) {
				case "+":cstack.push(op1+op2); break;
				case "-":cstack.push(op1-op2); break;
				case "*":cstack.push(op1*op2); break;
				case "/":cstack.push(op1/op2); break;
				case "%":cstack.push(op1%op2); break;
				case "^":cstack.push(pow(op1,op2)); break;
				}
			}
		}

		return cstack.peek();

	}

	public static String pre_to_post(String post)
	{
		Stack<String> sstack = new Stack<>();
		String op1,op2,res="";
		String []str = post.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			switch(str[i])
			{
			case "+":
			case "-":
			case "*":
			case "/":
			case "%":
			case "^":
				op1= new String(sstack.pop());
				op2=new String(sstack.pop());
				res= new String().concat(op1+" ").concat(op2+" ").concat(str[i]+" ");
				sstack.push(res);
				break;
			default:sstack.push(str[i]); 
			}
		}
		return res;
	}
}
