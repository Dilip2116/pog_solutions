import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Pascal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		int[][] a=new int[n][];
		
		for(int i =0;i<n;i++)
		{
			a[i]= new int[n];
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++) {
				if(j==0||(i==j)) {
					a[i][j]=1;
				}
				else
					a[i][j] = a[i-1][j-1] + a[i-1][j];
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		List<List<Integer>> r =generate(4);
		
		System.out.println(r);
		
	}
	
	 public static List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> res = new ArrayList<List<Integer>>();
	        for(int i=0;i<numRows;i++)
	        {
	            List<Integer> row = new ArrayList<Integer>();
	                for(int j=0;j<=i;j++)
	                {
	                    if(j==0||i==j)
	                        row.add(1);
	                    else
	                    {
	                        int d = res.get(i-1).get(j-1)+res.get(i-1).get(j);
	                        row.add(d);
	                    }
	                }
	            res.add(row);
	        }
	        
	        return res;
	        
	    }

}


