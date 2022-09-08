
public class Main {
		public static void main(String args[]) {
			
		/*	Node head = new Node(11);
		//	Node n2 =new Node(22);
		//	head.next=n2;
			
			head.next = new Node(22);
			
			head.next.next=new Node(33);
			
			head.next.next.next= new Node(55);
			
			System.out.println(head.data+","+
								head.next.data+","+
								head.next.next.data+","+
								head.next.next.next.data);
			*/
			
			LinkList list =new LinkList();
		
			
			
			list.append(1);
			list.append(2);
			list.append(3);
			list.append(4);
			list.append(5);
			list.append(6);
			list.append(7);
			list.append(8);
			
			
			Node it =list.head;
			int i=1;
			while(i<4)
			{
				i++;
				it=it.next;
				
			}
			
			System.out.println(it.data);
			list.remove_Node(it);
			
			//list.reverseBetween(list.head, 2, 7);
			//list.reverseBetween(list.head, 2, 4);
			System.out.println(list);
			
			//int mid = list.middle();
			//System.out.println("Middle element of LL is : "+mid);
			
			
			//if(list.check_Pallindrome(list) == true)
			//{
			//	System.out.println("LL is in Pallindrome");
			//}
			//else
			//{
			//	System.out.println("LL is not Pallindrome");
			//}
		}
		
}
