package Programs;

import java.util.Scanner;

public class LeapYear {
	
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("Enter a year");
		int year=sc.nextInt();
		leapYear(year);
	}	
	
	public static void leapYear(int year) {
		if(year%4==0) {
			if(year%400==0) {
				System.out.println("Century Leap Year");
			}else {
				System.out.println("Non-Century Leap Year");
			}
		}else {
			System.out.println("Non a Leap Year");
		}
	}

}
