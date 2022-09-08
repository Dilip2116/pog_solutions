
public class Main {

	public static void main(String[] args) {
		
		BtreeLevelwise bt = new BtreeLevelwise();
		BtreeLevelwise btt = new BtreeLevelwise();

		bt.insert(10);
		bt.insert(20);
		bt.insert(30);
		bt.insert(40);
		bt.insert(50);
		bt.insert(60);
		bt.insert(70);
		bt.insert(80);
		bt.insert(90);
		
		btt.insert(10);
		btt.insert(20);
		btt.insert(30);
		btt.insert(40);
		btt.insert(50);
		btt.insert(60);
		btt.insert(70);
		btt.insert(80);
		btt.insert(90);
		
		int height = bt.bTree_height();
	System.out.println("\nHeight: "+height);
		
		if(BtreeLevelwise.isIdentical(bt,btt))
		{
			System.out.println("Both B treesIdentical");
		}
		else
			System.out.println("Both B trees are not Identical");
		
		
		System.out.println("Level Wise traversing: ");

		bt.bTree_levelwise(); 
		
		System.out.println("\n---------printing line by line---------");
		
		bt.bTree_printLevelorderLineByLine();
		
		System.out.println("\nMirror Image: ");

		bt.bTree_MirrorImage();
		
		bt.bTree_levelwise();
		
		System.out.println("\n LeafNode: ");

		bt.bTree_leafnode();
		
		int leadfNodeSum = bt.bTree_leafnode_Sum();
		System.out.println("\nLeadf Node Sum : "+leadfNodeSum);
		
		
	}

	
}
