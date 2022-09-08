import java.util.Scanner;

public class Main {
	public static void main(String args []) {
		int arr[] = new int [] {31,35,35,40,42,50,66,69,69,70,70,70,78,78,78,85,85,88,90,90};
   		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value which u want to search");
	int key = sc.nextInt();
	
	int res=Count.count(key, arr);
	if(res!=-1) {
		System.out.println(key+" is found "+Count.c +" times in given input Array");
	}
	else {
		System.out.println("Not Found..");
	}
	sc.close();
 }

}


