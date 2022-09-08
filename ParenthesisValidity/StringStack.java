
public class StringStack {

	Nodes top;
	
	static class Nodes
	{
		String data;
		Nodes next;
		
		public Nodes(String d)
		{
			this.data= d;
			this.next=null;
		}
	}
	
	public StringStack()
	{
		this.top=null;
	}
	
	public boolean isempty()
	{
		if(top ==null) return true;

		else return false;
	}
	
	public String peek()
	{
		if(top==null) return "*";
		else return top.data;
	}
	
	public void push(String d) {
		Nodes newnode = new Nodes(d);
	if(top ==null) top =newnode;
	else
	{
		newnode.next=top;
		top= newnode;
	}
	}
	public String pop()
	{
		String value =top.data;
		top=top.next;
		return value;
	}
	
	public static void main(String [] args) {
		
	}
}

class Nodes
{
	char data;
	Nodes next;
	
	public Nodes(char d)
	{
		this.data= d;
		this.next=null;
	}
}