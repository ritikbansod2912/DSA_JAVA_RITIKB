/*
 * Binamial Coefficient nBr= n! / (r! * (n-r!))
 */

package Programs;

import java.awt.image.RescaleOp;
import java.util.Scanner;

public class BinomialCoefficient {

	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		System.out.println("Enter the value of r");
		int r=sc.nextInt();
		double result = (double)(factorial(n) / ((factorial(r)*factorial(n-r))*1.0));
		System.out.println("binomial coefficient : "+result);
	}
	
	//helper
	public static int factorial(int n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f*=i;
		}
		return f;
	}
}
