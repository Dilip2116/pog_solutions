
public class Count {
	static int c=0;
	
	public static int count(int key ,int arr[]) {
		int l =0;
		int h=arr.length-1;
		c=0;
		int mid =(l+h)/2;
		
		while((arr[mid]!=key) && l<=h) {
			if(key<arr[mid]) {
				h=mid-1;
			}
			else
			{
				l=mid+1;
			}
			mid=(l+h)/2;
		}
		if(key == arr[mid])
		{
			c+=1;
			for(l=mid-1;arr[l]==key;c++,l--);
			for(h=mid+1;arr[h]==key;c++,h++);
			return c;
			
		}
		return -1;
	}

}
