package Programs;

import java.util.Scanner;

public class Factorial {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int num=sc.nextInt();
		System.out.println("Facorial : "+factorial(num));
	}
	
	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		return f;
	}
}
