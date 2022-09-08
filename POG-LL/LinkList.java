
public class LinkList {

	Node head;

	public LinkList() {
		this.head=null;
	}

	public LinkList(Node head) {
		this.head=head;
	}

	public void insert(int data) {
		Node temp =new Node(data);

		if(head == null) {
			head=temp;
		}
		else {
			temp.next=head;
			head=temp;

		}
	}


	public void append(int data) {
		Node temp =new Node(data);

		if(head == null) {
			head =temp;
		}
		else {
			Node it =head; // it is pointing sama node as head 
			while(it.next!=null) {
				it=it.next;
			}
			it.next=temp;
			temp.next=null;
		}
	}


	public void deleteFirst() {

		if(head==null) {
			System.out.println("LL is Empty");
		}
		else
		{
			//check if only one node is present
			if(head.next==null) {
				head=null;
			}
			else
			{
				//More than one node in LL
				Node t =head;
				head=t.next;
				t.next=null;

			}
		}
	}

	public void deleteLast() {
		if(head==null) {
			System.out.println("LL is empty....");
		}
		else {
			if(head.next==null) {
				head=null;
			}
			else
			{
				Node it = head;
				Node t=null;
				while(it.next!=null) {
					t=it;
					it=it.next;
				}
				t.next=null;
				it=null;
			}
		}
	}

	public void even_numbers() {
		if(head==null)
			System.out.println("LL is Empty..");
		else {
			Node it=head;
			while(it!=null) {
				if(it.data%2==0)
					System.out.print(it.data+" ");
				it=it.next;
			}
		}
	}
	public void odd_numbers()
	{
		if(head==null)
			System.out.println("LL is Empty..");
		else {
			Node it=head;
			while(it!=null) {
				if(it.data%2!=0)
					System.out.print(it.data+" ");
				it=it.next;
			}
		}
	}

	public int smallest_number() {
		int min=0;
		if(head==null)
			System.out.println("LL is Empty..");
		else {
			Node it=head;
			min=it.data;
			while(it.next!=null) {
				if(it.data<min)
					min=it.data;
				it=it.next;
			}
		}
		return min;


	}

	public int largest_number() {
		int max=0;
		if(head==null)
			System.out.println("LL is Empty..");
		else {
			Node it=head;
			max=it.data;
			while(it.next!=null) {
				if(it.data>max)
					max=it.data;
				it=it.next;
			}
		}
		return max;
	}

	public void deleteByPos(int pos) {
		int noOfnodes=getLLLength();
		if(pos==1)
			deleteFirst();
		else if (pos==noOfnodes)
			deleteLast();
		else
		{
			Node it=head;
			Node t=null;
			for(int i=1;i<pos;i++) {
				t=it;
				it=it.next;
			}
			t.next=it.next;
			it.next=null;
		}

	}

	/*public void deleteByPos(int pos) {
		int noOFNodes =getLLLength();

		if(pos==1) {
			deleteFirst();

		}
		else if(pos== noOFNodes) {
			deleteLast();
		}
		else if(pos>1 && pos<noOFNodes) {
			Node it=head;
			for(int i=1;i<pos-1;i++) {
				it=it.next;
			}
			Node t=it.next;
			it.next=t.next;
			t.next=null;

		}
		else {
			System.out.println("Invalid Postion ----");
		}

	}*/

	//wrapper function
	public void reversePrint()
	{
		reversePrintRec(head);
		System.out.println();
	}

	private void reversePrintRec(Node it) {
		if(it.next!=null)   // forward Recursion ...
			reversePrintRec(it.next);
		System.out.print(it.data+" ");   // backword recusrion ...
	}
	private int getLLLength() {
		int noOFNodes=0;
		Node it=head;
		while(it!=null) {
			noOFNodes++;
			it=it.next;
		}
		return noOFNodes;
	}

	public void insertByPos(int data,int pos) {
		Node temp =new Node(data);
		int noOfnodes=getLLLength();
		if(pos==1)
			insert(data);
		else if (pos==noOfnodes)
			append(data);
		else if(pos>1 && pos<noOfnodes)
		{
			Node it=head;
			for(int i=1;i<pos-1;i++) {
				it=it.next;
			}
			temp.next=it.next;
			it.next=temp;
		}
		else 
			System.out.println("\nInvalid Position....");

	}
	/*public void insertByPos(int data,int pos) {

		int noOFNodes =getLLLength();

		if(pos==1) {
			insert(data);
		}
		else if(pos== noOFNodes+1) {
			append(data);
		}
		else if(pos>1 && pos<noOFNodes +1) {

			Node temp = new Node(data);
			Node it =head;
			for(int i=1;i<pos-1;i++) {
				it=it.next;
			}
			temp.next=it.next;
			it.next=temp;
		}
		else {
			System.out.println("Invalid Postion ----");
		}
	}*/

	public void reverse() {
		Node it =head;
		Node itp=null;
		Node itn=head;

		while(it!=null) {
			itn=itn.next;
			it.next=itp;
			itp=it;
			it=itn;
		}
		head=itp;
	}
	public void insertByValue(int lldata,int data) {
		Node temp=new Node(data);
		Node it =head;
		while(it.data!=lldata) {
			it=it.next;
		}
		temp.next=it.next;
		it.next=temp;

	}
	public void reverseBetween(Node head, int left, int right) {
		 Node itL =head;
		 Node itLp = null;
	      Node itR =head;
        for(int i=1;i<left;i++){
        		itLp = itL;
                itL=itL.next;
            }
        for(int i=1;i<right;i++){
                itR=itR.next;
            }
        Node it1= head;
        
        itLp.next = null;
        it1 = itR.next;
        itL = reverse1(head);
       
        
        itLp.next = itL;
        itR.next = it1;
	}
	
	
	public Node reverse1(Node head) {
		Node it =head;
		Node itp=null;
		Node itn=head;

		while(it!=null) {
			itn=itn.next;
			it.next=itp;
			itp=it;
			it=itn;
		}
		head=itp;
		return head;
	}
	
	// checking for LL is Pallindrome or not ..
	
	public boolean check_Pallindrome(LinkList list ) {
		Node slow_p,fast_p,sStart ,prev_slow;
		boolean res;
		if((list.head==null)||(list.head.next==null)) {
			res = true;
		}
		else {
			prev_slow = slow_p = fast_p = list.head;
			while(fast_p.next!=null &&
					fast_p.next.next!=null)
			{
				prev_slow = slow_p;
				slow_p=slow_p.next;
				fast_p = fast_p.next.next;
			}
			System.out.println("Middle Node : "+slow_p.data);
			sStart = slow_p.next;
			if(fast_p.next==null) {
				sStart =  reverse1(sStart);
				prev_slow.next=null;
				res=isidentical(list.head,sStart);
				sStart = reverse1(sStart);
				prev_slow.next=sStart;
			}
			else
			{
				sStart =  reverse1(sStart);
				slow_p.next=null;
				res=isidentical(list.head,sStart);
				sStart = reverse1(sStart);
				slow_p.next=sStart;
			}
		}
		return res;
			
	}
	
	//1 2 3 5 4 6 7 8
	public void remove_Node(Node it) {
		int d = it.next.data;
		it.next.data =it.data;
		it.data = it.next.data;
		Node  del =it.next;
		it.next = it.next.next;
		del.next=null;
		del=null;
		
	}
	
	
	public boolean isidentical(Node s1,Node s2)
	{
		while(true) {
			if(s1==null && s2==null)
				return true;
			if(s1==null || s2==null)
				return false;
			if(s1.data!=s2.data)
				return false;
			s1=s1.next;
			s2=s2.next;
		}
	}
	
	// print middle of linklist....
	public int middle() {
		Node it=head;
		Node itp=head;
		while(it.next!=null && it.next.next!=null) {
			itp=itp.next;
			it=it.next.next;
		}
		return itp.data;
	}
	public String toString() {

		String str="";
		if(head==null) {
			str="LL is empty....";
		}
		else {
			Node it =head; // it is pointing same node as head
			//while(it.next!=null) ==> without last node ......
			while(it!=null) //  ==> last node 
			{
				str+=it.data+" ";
				it=it.next;
			}
		}

		return str;
	}
}
