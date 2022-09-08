import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BtreeLevelwise {

	BtNode root;


	public void insert(int key)
	{
		BtNode  new_node = new BtNode(key);
		Queue<BtNode> que = new LinkedList<>(); //Queue is an interface 

		if(root==null)
		{
			root = new_node;
			return;
		}

		BtNode temp = root;
		que.add(temp);
		while(!que.isEmpty())
		{
			temp=que.remove();
			if(temp.left==null)
			{
				temp.left=new_node;
				break;
			}
			else
			{
				que.add(temp.left);
			}

			if(temp.right==null)
			{
				temp.right=new_node;
				break;
			}
			else
			{
				que.add(temp.right);
			}
		}

	}

	public void bTree_levelwise()
	{
		Queue<BtNode> que = new LinkedList<>(); //Queue is an interface 



		BtNode temp = root;
		if(temp==null)
		{
			System.out.print("Tree is EMpty..");
		}
		que.add(temp);
		while(!que.isEmpty())
		{
			temp=que.remove();
			System.out.print(temp.data+" ");
			if(temp.left!=null)
			{

				que.add(temp.left);
			}

			if(temp.right!=null)
			{

				que.add(temp.right);
			}

		}
	}

	public int bTree_height()
	{
		Queue<BtNode> que = new LinkedList<>(); //Queue is an interface 


		int h=0;

		BtNode temp = root;
		if(temp==null)
		{
			System.out.print("Tree is EMpty..");
			return 0;
		}
		que.add(temp);
		que.add(null);
		while(!que.isEmpty())
		{
			temp=que.remove();

			if(temp==null)
			{
				if(!que.isEmpty())
					que.add(null);
				
				h+=1;
				
				continue;
				

			}

			if(temp.left!=null)
				que.add(temp.left);
			if(temp.right!=null)
				que.add(temp.right);
		}
		return h;
	}
	
	
	
	public void bTree_printLevelorderLineByLine()
	{
		Queue<BtNode> que = new LinkedList<>(); //Queue is an interface 

		BtNode temp = root;
		if(temp==null)
		{
			System.out.print("Tree is EMpty..");
		}
		que.add(temp);
		que.add(null);
		while(que.size()>1)
		{
			temp=que.remove();
			//System.out.print(temp.data+" ");

			if(temp==null)
			{
				System.out.println();
				que.add(null);
				continue;
			}
			System.out.print(temp.data+" ");
			if(temp.left!=null)
				que.add(temp.left);
			if(temp.right!=null)
				que.add(temp.right);
		}
	}
	public void bTree_leafnode()
	{
		Queue<BtNode> que = new LinkedList<>(); //Queue is an interface 



		BtNode temp = root;
		if(temp==null)
		{
			System.out.print("Tree is EMpty..");
		}
		que.add(temp);
		//System.out.print("\nLEAF NODE : ");
		while(!que.isEmpty())
		{
			temp=que.remove();
			if(temp.right==null && temp.left==null)
				System.out.print( temp.data+" ");
			if(temp.left!=null)
			{

				que.add(temp.left);
			}

			if(temp.right!=null)
			{

				que.add(temp.right);
			}

		}
	}

	public int bTree_leafnode_Sum()
	{
		Queue<BtNode> que = new LinkedList<>(); //Queue is an interface 




		BtNode temp = root;
		int sum=0;
		if(temp==null)
		{
			System.out.print("Tree is EMpty..");
		}
		que.add(temp);
		//System.out.print("\nLEAF NODE : ");
		while(!que.isEmpty())
		{
			temp=que.remove();
			if(temp.right==null && temp.left==null)
				sum+=temp.data;
			if(temp.left!=null)
			{

				que.add(temp.left);
			}

			if(temp.right!=null)
			{

				que.add(temp.right);
			}

		}
		return sum;
	}

	public void swap (BtNode p)
	{
		BtNode t;
		t=p.left;
		p.left=p.right;
		p.right=t;
	}



	public void bTree_MirrorImage()
	{
		Queue<BtNode> que = new LinkedList<>(); //Queue is an interface 



		BtNode temp = root;
		if(temp==null)
		{
			System.out.print("Tree is EMpty..");
		}
		que.add(temp);
		//System.out.print("\nLEAF NODE : ");
		while(!que.isEmpty())
		{
			temp=que.remove();
			swap(temp);
			if(temp.left!=null)
			{

				que.add(temp.left);
			}

			if(temp.right!=null)
			{

				que.add(temp.right);
			}

		}
	}



	public static boolean isIdentical(BtreeLevelwise t1,BtreeLevelwise t2)
	{
		BtNode pt1 = t1.root;
		BtNode pt2 = t2.root;

		if(pt1==null || pt2==null)
			return false;


		Queue<BtNode> q1 = new LinkedList<>();
		Queue<BtNode> q2 = new LinkedList<>();

		q1.add(pt1);
		q2.add(pt2);

		while(!q1.isEmpty() && !q2.isEmpty())
		{
			pt1=q1.remove();
			pt2=q2.remove();
			if(pt1.data!=pt2.data)
				return false;
			if(pt1.left!=null)
				q1.add(pt1.left);

			if(pt1.right!=null)
				q1.add(pt1.right);

			if(pt2.left!=null)
				q2.add(pt2.left);

			if(pt2.right!=null)
				q2.add(pt2.right);

		}

		if(q1.isEmpty() && q2.isEmpty() )
			return true;
		else
			return false;


	}
}
class  BtNode
{
	BtNode left;
	int data;
	BtNode right;

	public BtNode(int d)
	{
		data=d;
		left=null;
		right=null;
	}

	public BtNode(BtNode d)
	{
		data=d.data;
		left=d.left;
		right=d.right;
	}
}