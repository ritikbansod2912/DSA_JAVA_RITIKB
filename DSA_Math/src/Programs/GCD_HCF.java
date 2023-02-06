package Programs;

import java.util.Scanner;

public class GCD_HCF {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the two number");
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		System.out.println(FindGCD(a,b));
	}
	
	public static int FindGCD(int a,int b) {
		int gcd=0;
		for(int i=Math.min(a, b);i>=1;i--) {
			if(a%i==0 && b%i==0) {
				gcd=i;
				break;
			}
		}
		return gcd;
	}
}
