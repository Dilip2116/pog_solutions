
public class Node {
	
	int data;
	Node next;
	
	public Node()
	{
		data =0;
		next=null;
	}
	
	public Node(int data) {
		this.data=data;
		this.next=null;
	}
	
	public Node(Node next) {
		this.next=next;
	}
	
	public Node(int data,Node next) {
		this.data=data;
		this.next=next;
	}
	
	
	
}
