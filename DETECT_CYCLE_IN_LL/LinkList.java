
public class LinkList {
	
	 Node head;
	 
	 public LinkList() {
		 this.head=null;
	 }
	
	 public void insert(int data) {
		 Node temp = new Node(data);
		 if(head==null) {
			 head = temp;
		 }
		 else {
			 Node it = head;
			 while(it.next!=null) {
				 it=it.next;
			 }
			 it.next=temp;
		
		 }
	 }
	 
	 
	
	 public void insert_cycle(int data) {
		 Node it=head;
		 if(head ==null) {
			 System.out.println("Empty");
			 return ;
		 }
			 Node itt =null;
			 Node itp = null;
			 while(it!=null) {
				 itp = it;
				 if(it.data==data)
					 itt=it;
				 it=it.next;
			 }
			 if(itt!=null) {
				 itp.next=itt;
			 }
		 
	 }
	 
	 public  Node detect_cycle() {
		 Node slow = head;
		 Node fast = head;
		 
		 while(fast!=null && fast.next!=null) {
			 slow=slow.next;
			 fast=fast.next.next;
			 if(slow==fast)
				 return slow;
		 }
		 return null;
	 }
	 
	 public int length(Node C) {
		 Node it1,it2;
		 int c_length=0,rem_length=0;
		 it1=it2=C;
		 do {
			 c_length=c_length+1;
			 it2=it2.next;
		 }while(it1!=it2);
		 
		 System.out.println("Length of Cycle : "+c_length);
		 it1=head;
		 while(it1!=it2) {
			 rem_length=rem_length+1;
			 it1=it1.next;
			 it2=it2.next;
		 }
		 
		 System.out.println("Start Node of Cycle = "+it1.data);
		 
		 return c_length+rem_length;
		 
	 }
	
	 public void remove_cycle(int length) {
		 Node it=head;
		 for(int i=1;i<length;i++) {
			 it=it.next;
		 }
		 it.next=null;
	 }
	 
	 public void print() {
		 if(head==null) {
			 System.out.println("EMpty");
		 }
		 else {
			 Node it = head;
			 while(it!=null) {
				 System.out.print(it.data+" ");
				 it=it.next;
			 }
		 }
	 }
	
}//end of LL class...



class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}//end of Node class