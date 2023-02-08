package Programs;

import java.util.Scanner;

public class Prime_InRange {
static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the range ");
		System.out.println("Start range : ");
		int start =sc.nextInt();
		System.out.println("End Range :");
		int end=sc.nextInt();
		
		for(int i=start;i<=end;i++) {
			isPrime(i);
		}
	}
	
	public static void isPrime(int num) {
		if(num==1) {
			return;
		}
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				return;
			}
		}
		System.out.print(num+" ");
	}
}
