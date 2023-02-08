package Programs;

import java.util.Scanner;

public class SumOfDigit {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		System.out.println("Sum of Digits : "+sumOfDigits(num));
	}
	
	public static int sumOfDigits(int n) {
		int sum=0;
		for(int i=1;n>0;i++) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
}
