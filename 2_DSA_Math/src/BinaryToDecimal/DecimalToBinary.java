package BinaryToDecimal;

import java.util.Scanner;

public class DecimalToBinary {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter decimal number");
		int n=sc.nextInt();
		System.out.println(getBinary(n));
	}
	
	public static int getBinary(int n) {
		int binary=0;
		int pow=0;
		
		while(n>0) {
			int rem=n%2;
			n/=2;
			binary=binary+(rem*(int)Math.pow(10,pow));
			pow++;
		}
		return binary;
	}
}


/*
 DRY RUN :
 
 decimalN=5
 binaryN=?
 pow=0
 
 ITERATION 1:        decimalN=5 , binaryN=0 , pow=0
 ---------------
 rem=decimal%2 ==> 1
 binary/=2 ==> 2
 binaryN=binaryN + (rem* Math.pow(2 , pow)); ==> 0+(1*1)=1
 pow++ ==> 1;
 
 ITERATION 2:        decimalN=2 , binaryN=1 , pow=2
 ---------------
 rem=decimal%2 ==> 0
 binary/=2 ==> 1
 binaryN=binaryN + (rem* Math.pow(2 , pow)); ==> 1+(0*10)=1
 pow++ ==> 2;
 
 ITERATION 3:        decimalN=1 , binaryN=1 , pow=2
 ---------------
 rem=decimal%2 ==> 1
 binary/=2 ==> 0
 binaryN=binaryN + (rem* Math.pow(2 , pow)); ==> 1+(1*100)=101
 pow++ ==> 3;
 
 ANS : binaryN = 101
 
*/
