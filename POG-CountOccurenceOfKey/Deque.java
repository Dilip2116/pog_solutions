
public class Deque {
	int arr[];
	int R;
	int F;
	
	public Deque()
	{
		this.arr=new int[5];
		this.F=-1;
		this.R=1;
	}
	
	public Deque(int n)
	{
		this.arr=new int[5];
		this.F=-1;
		this.R=1;

	}
	
	public boolean isFull()
	{
		if(this.F==0 && this.R==arr.length-1)
			return true;
		return false;
			
	}
	
	public boolean isempty()
	{
		if(this.F==-1 || this.R==-1)
			return true;
		return false;
	}
	
	public void insertR(int v)
	{
		if(!isFull())
		{
			if(F==-1) F=R=0;
			if(this.R!=arr.length-1)
				R++;
			
			else {
				F--;
				for(int i=F;i<R;i++)
				{
					arr[i]=arr[i+1];
				}
			}
			arr[R]=v;
			
		}
		else
			System.out.println("Queue is full");
	}
	
	public void insertF(int v)
	{
		if(!isFull())
		{
			if(F==-1) R=F=0;
			if(F!=0)
				F--;
			else {
				R++;
				for(int i=R;i>F;i--)
				{
					arr[i]=arr[i-1];
				}
			}
			arr[F]=v;
			
		}
		else
			System.out.println("Queue is full");
	}
	
	public int removef()
	{
		if(!isempty())
		{
			int v = arr[F];
			if(F!=R)
				F++;
			else 
				F=R=-1;
			return v;
		}
		else
			System.out.println("Empty");
		return -1;
	}
	
	public int removeR()
	{
		if(!isempty())
		{
			int v = arr[R];
			if(F!=R)
				R--;
			else 
				F=R=-1;
			
		
			return v;
			
		}
		else {
			System.out.println("Empty");
			return -1;}
		
	}
	
	public String toString()
	{
		String s ="";
		if(!isempty())
		{
			for(int i=F;i<=R;i++)
				s+=arr[i]+" ";
			
			
		}
		else
			System.out.println("Empty");
		return s;
			
	}
	
	public static void main(String args[])
	{
		Deque dq = new Deque();
		
		dq.insertR(5);
		dq.insertR(6);
		dq.insertR(7);
		dq.insertR(8);
		dq.insertR(8);
		
		System.out.println(dq);
	}
}
