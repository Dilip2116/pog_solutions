
public class throwingball {

	public static void main(String[] args) {
		int arr[] = new int[] {12,15,23,10,35,45,38,70,90,75};
		
		int max=arr[0];
		int count =0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				count=count+1;
				max=arr[i];
			}
		}
		
		System.out.println("Number of building from which he can throw ball : "+count);
  
	}

}
