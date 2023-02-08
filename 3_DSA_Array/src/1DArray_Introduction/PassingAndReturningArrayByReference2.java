
import java.util.Scanner;

public class PassingAndReturningArrayByReference2 {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Calling static scan() function and passes the size of array. 
		int[] array1 = scan(5);
		
		//Calling the static print() function and passed the array reference to the method.
		print(array1);
		System.out.println("Execution Ended");
		
	}
	
//	Scan method taking size of array as argument/parameter and returning the initialized array.
	public static int[] scan(int size) {
		int[] array1=new int[size];
		System.out.println("Scanning");
		System.out.println("Enter the "+size+" element");
		for(int i=0;i<array1.length;i++) {
			array1[i]=sc.nextInt();
		}
		System.out.println("Returning Array to main method");
		return array1;
	}
	

//	Print method taking the reference of an array and traversing it with forEach loop.
	public static void print(int[] array) {
		System.out.println("Traversing the array");

		for(int i:array) {
			System.out.println(i);
		}
	}
}
