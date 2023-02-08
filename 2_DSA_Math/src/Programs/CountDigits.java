package Programs;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		System.out.println(countDigits(num));
	}
	
	public static int countDigits(int n) {
		int count=0;
		for(int i=1;n>0;i++) {
			count++;
			n/=10;
		}
		return count;
	}
}
