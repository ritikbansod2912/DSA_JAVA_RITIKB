package Programs;

import java.util.Scanner;

public class AverageOfNnumber {
	
	public static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("Enter the three number");
		int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
		System.out.println("Average = "+average(a,b,c));
	}
	
	public static double average(int a,int b,int c) {
		double average=(a+b+c)/2.0;
		return average;
	}
}
