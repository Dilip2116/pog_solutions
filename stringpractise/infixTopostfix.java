package stringpractise;

import java.util.Stack;

public class infixTopostfix {

	public static void main(String[] args) {


		String infix = "a+b/c-d*e" ; // op :- abc/+de*-

		System.out.println("Infix : "+infix);

		String post = infix_to_postfix(infix);

		System.out.println("Postfix : "+post);
		
		
		String pre = post_to_pre(post);
		
		System.out.println("Prefix : "+pre);

		int result = eval_postfix("10 2 * 3 5 * + 9 -");

		System.out.println("Result of PostFix Expression :  "+result);

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

	public static String infix_to_postfix(String infix) {
		Stack<Character> cstack = new Stack<>();
		String result="";

		for(int i=0;i<infix.length();i++) {
			char input=infix.charAt(i);
			if(input ==' ')
				continue;

			switch(input)
			{
			case '(':cstack.push(input); break;
			case ')':
				while(!cstack.isEmpty() && cstack.peek()!='(')
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
				while(!cstack.isEmpty() && precedence(cstack.peek())>=precedence(input))  

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
		return result;

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
	public static int eval_postfix(String postfix)  
	{
		Stack<Integer> cstack = new Stack<>();

		String []oper = postfix.split(" ");

		for(int i=0;i<oper.length;i++) {
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
				case "+":cstack.push(op2+op1); break;
				case "-":cstack.push(op2-op1); break;
				case "*":cstack.push(op2*op1); break;
				case "/":cstack.push(op2/op1); break;
				case "%":cstack.push(op2%op1); break;
				case "^":cstack.push(pow(op2,op1)); break;
				}
			}
		}

		return cstack.peek();

	}
	
	public static String post_to_pre(String post)
	{
		Stack<String> sstack = new Stack<>();
		String op1,op2,res;
		String []str = post.split(" ");
		for(int i=0;i<str.length;i++)
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
					res= new String(str[i]).concat(op2).concat(op1);
					sstack.push(res);
					break;
			default:sstack.push(str[i]); 
			}
		}
		return sstack.peek();
	}

}
