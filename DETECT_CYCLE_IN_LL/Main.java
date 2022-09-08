
public class Main {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		
		list.insert(8);
		list.insert(20);
		list.insert(12);
		list.insert(33);
		list.insert(60);
		list.insert(30);
		list.insert(11);
		
		list.insert_cycle(33);
		
		Node C = list.detect_cycle();
		
		if(C!=null) {
			System.out.println("Cycle detected in LL");
		}
		else
			System.out.println("NO Cycle is Detected in LL");
		
		int length = list.length(C);
		System.out.println("Total length of LL : "+length);
		
		list.remove_cycle(length);
		
		list.print();
	}

}
