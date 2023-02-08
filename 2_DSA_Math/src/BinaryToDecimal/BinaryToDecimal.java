package BinaryToDecimal;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the binary number");
		int n=scanner.nextInt();
		System.out.println(getDecimal(n));
	}
	
	public static int getDecimal(int n) {
		int decimalN=0;
		int pow=0;
		while(n>0) {
			int rem=n%10;
			n/=10;
			decimalN+=(rem*Math.pow(2, pow));
			pow++;
		}
		return decimalN;
	}
}

/*
 	 DRY RUN :
 	 
 	 binaryN=1010;
 	 decimalN=?
 	 pow=0
 	 
 	 ITERATION 1:
 	 ---------------
 	 rem=binaryNum%10 ==> 0
 	 binary/=10 ==> 101
 	 decimalN=decimalN + (rem* Math.pow(2 , pow)); ==> 0
 	 pow++ ==> 1;
 	 
 	 ITERATION 2:       decimalN = 0 , binaryN=101 pow=1
 	 ---------------
 	 rem=binaryNum%10 ==> 1
 	 binary/=10 ==> 10
 	 decimalN=decimalN + (rem* Math.pow(2 , pow)); ==> 0+(1*2)=2 
 	 pow++ ==> 2;
 	 
 	 ITERATION 3:       decimalN = 2 , binaryN=10 pow=2
 	 ---------------
 	 rem=binaryNum%10 ==> 0
 	 binary/=10 ==> 1
 	 decimalN=decimalN + (rem* Math.pow(2 , pow)); ==> 2+0*4)=2 
 	 pow++ ==> 3;
 	 
 	 ITERATION 4:       decimalN = 2 , binaryN=1 pow=3
 	 ---------------
 	 rem=binaryNum%10 ==> 1
 	 binary/=10 ==> 0
 	 decimalN=decimalN + (rem* Math.pow(2 , pow)); ==> 2+(1*8)=10 
 	 pow++ ==> 3;
 	 
 	 ANS : decimalN = 10
 	 
*/