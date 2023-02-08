package Programs;

import java.util.Scanner;

public class isEvenOrOdd {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter any number");
		int n=sc.nextInt();
		System.out.println(isEven(n)?"Even":"Odd");
	}
	
	public static boolean isEven(int n) {
		if(n%2==0)
			return true;
		else {
			return false;
		}
	}
}
