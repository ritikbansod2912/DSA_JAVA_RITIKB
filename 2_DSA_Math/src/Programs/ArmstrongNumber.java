package Programs;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scanner.nextInt();
		int count=countDigits(num);
		System.out.println(isArmStrong(num, count)==num?
				"Armstrong":"Not Armstrong");
	}
	
	public static int isArmStrong(int num , int count) {
		int armStrongNum=0;
		for(int i=1;num>0;i++) {
			armStrongNum+=Math.pow(num%10, count);
			num/=10;
		}
		return armStrongNum;
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
