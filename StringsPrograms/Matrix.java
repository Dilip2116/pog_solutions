package matrix.matrixOutersummax;
import java.util.Scanner;
public class Matrix {

	public  static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter rows and column ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int a[][] = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		/*  0 1 2 3
		    --------
		 0 |1 2 3 4
		 1 |7 3 4 6
		 2 |8 1 2 4
		 3 |7 2 5 1 */
		
		int max=0,sum=0,resi=0,resj=0,starti=0,startj=0;
		while(starti<=(n-3)) {
			startj=0;
			while(startj<=(m-3)) {
				sum=0;
				for(int i=starti;i<starti+3;i++)
				{
					for(int j=0;j<startj+3;j++) {
						if(i==starti || j==startj || i==starti+2 || j==startj+2)
						{
							sum=sum+a[i][j];
							
						}
						
						
					}
					System.out.print(sum+" ");
			}
				if(sum>max) {
					max=sum;
					resi=starti;
					resj=startj;
				}
				startj=startj+1;
		}
			starti=startj+1;
	}
		for(int i=resi;i<resi+3;i++) {
			for(int j = resj;j<resj+3;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

}
}