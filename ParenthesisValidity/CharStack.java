
public class CharStack 
{

	Node top;
	
	
	public CharStack()
	{
		this.top=null;
	}

	
	public boolean isempty()
	{
		if(top ==null) return true;

		else return false;
	}

	
	public char peek()
	{
		if(top==null) return '*';
		else return top.data;
	}

	
	
	public void push(char d) {
		Node newnode = new Node(d);
		if(top ==null) top =newnode;
		else
		{
			newnode.next=top;
			top= newnode;
		}
	}
	
	
	public char pop()
	{
		char value =top.data;
		Node it =top;
		top=top.next;
		it.next=null;
		return value;
	}

	//traverse expression "{9+(5*7)-3} 
	//if char is opening paranthesis then push it into stack..
	// stack {..(... if char is closing parenthesis then we will pop char from stack 
	//we will check popped char with current char (closing) ,let us write a diff function for matching the parenthesis..

	boolean match(char a, char b) {
		if((a=='[' && b==']') || (a=='{' && b=='}') ||(a=='(' && b==')')) return true;
		else return false;
	}

	
	boolean  ccheck(String exp) //"{9+(5*7)-3}
	{
		int i;
		char temp;
		for( i =0;i<exp.length();i++) {
			if(exp.charAt(i)=='(' || exp.charAt(i)=='{' || exp.charAt(i)=='[')
				push(exp.charAt(i));

			if(exp.charAt(i)==')' || exp.charAt(i)=='}' || exp.charAt(i)==']')
			{
				if(top ==null) {
					System.out.println("Right paranthsis are more!!");
					return false;
				}
				else
				{
					temp=pop();
					if(!match(temp,exp.charAt(i)))
					{
						System.out.println("Mismatched Paranthesis are "+temp+" "+exp.charAt(i));
						return false;

					}
				}

			}
		}
		if(isempty())
			return true;
		else {
			System.out.println("Left Paranthesis is More");
			return false;
		}
	}

	public static void main(String [] args) {
		CharStack cstack = new CharStack();
		String s="{9+(5*7)-3}";
		if(cstack.ccheck(s))
		{
			System.out.println("Valid Expression");
		}
		else
		{
			System.out.println("Invalid Expression");
		}
		
	}

}



class Node
{
	char data;
	Node next;

	public Node(char d)
	{
		this.data= d;
		this.next=null;
	}
}