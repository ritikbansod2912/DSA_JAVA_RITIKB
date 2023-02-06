package Programs;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		System.out.println(reverse(num));
	}
	
	public static int reverse(int n) {
		int rev=0;
		for(int i=1;n>0;i++) {
			rev=(rev*10)+(n%10);
			n/=10;
		}
		return rev;
	}
}
