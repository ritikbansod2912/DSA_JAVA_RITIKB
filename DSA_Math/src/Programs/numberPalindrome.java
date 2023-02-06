package Programs;

import java.util.Scanner;

public class numberPalindrome {
	
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println(n==isPalindrome(n) ? 
				"Palindrome":"Not Palindrome");
		
	}
	
	public static int isPalindrome(int n) {
		int rev=0;
		for(int i=1;n>0;i++) {
			rev=(rev*10)+n%10;
			n/=10;
		}
		return rev;
	}
}
