package Programs;

import java.util.Scanner;

public class printAllDivisor {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		printDivisor(num);
	}
	
	public static void printDivisor(int n) {
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}
}
