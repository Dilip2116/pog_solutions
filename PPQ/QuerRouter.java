import java.util.Scanner;

 public class QuerRouter {
	 public static void main(String args[])
		{
			String s = new String();
			int N;
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter string ans size of queue");
			s=sc.next();
			N=sc.nextInt();
			
			System.out.println(routerbusy(s,N));
		}
		
		public static int routerbusy(String s,int N)
		{
			CQueue q = new CQueue(N);
			int cnt=0;
			
			char str[]=s.toCharArray();
			
			for(int i=0;i<str.length;i++)
			{
				if(str[i]=='E' || str[i]=='e')
				{
					if(q.isfull()) cnt=cnt+1;
					else q.insert(i);
				}
				else
					q.remove();
			}
			return cnt;
		}
	
	

}


 class CQueue
{
	 int [] arr;
		int F;
		int R;
		
		public CQueue()
		{
			this.arr=new int[5];
			this.F=-1;
			this.R=-1;
			
		}
		public CQueue(int n)
		{
			this.arr=new int[n];
			this.F=-1;
			this.R=-1;
			
		}

		public boolean isfull()
		{
			if(this.R+1==F || (this.F==0 && this.R==this.arr.length-1 )) {
				return true;
				}
			else return false;
		}
		
		public boolean isempty()
		{
			if(F==-1) {
				return true;
				}
			else
				return false;
		}
		public void insert(int value) {
			if(this.R+1==F || (this.F==0 && this.R==this.arr.length-1 )) {
				System.out.println("\nQueue is FULL: ");
				}
			else {
				if(R!=arr.length-1) {
					this.R++;
					this.arr[R]=value;
			
					if(F==-1)
						this.F++;
					}
				else {
					this.R=0;
					this.arr[R]=value;
				}
			
				
			}
			//System.out.println(this);
			
		}
		
		public int remove() {
			int value =0;
			if(isempty()) {
				System.out.println("Empty");
				return -1;}
				value =this.arr[F];
				if(this.F==this.arr.length-1)
					this.F=0;
				if(F!=R) {
					this.F++;
				}
				else
					this.F=this.R=-1;
			
			//System.out.print(this);
			return value;
		}
		
		
	
}