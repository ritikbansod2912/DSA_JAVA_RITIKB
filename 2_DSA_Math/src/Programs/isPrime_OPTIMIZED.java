package Programs;

import java.util.Scanner;

public class isPrime_OPTIMIZED {
static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter number");
		int num=sc.nextInt();
		System.out.println(isPrime(num)?"Prime":"Not Prime");
	}
	
	public static boolean isPrime(int num) {
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
