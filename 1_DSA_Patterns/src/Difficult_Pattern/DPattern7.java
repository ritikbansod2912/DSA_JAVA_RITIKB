/*
 	      A			[space , character , space]	outer loop -> 1 to n
 	    A B A						inner loop (space) -> 1 to n-1
 	  A B C B A						inner loop (character) -> 1 to 2*i-1
 	A B C D C B A
 */
package Difficult_Pattern;

public class DPattern7 {

	public static void main(String[] args) {
		int n=4;
		char ch;

		//outer loop for total no. of rows
		for(int i=1;i<=n;i++) {

			//SPACE
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			ch='A';

			//CHARACTER
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(ch+" ");
				if(j>=(2*i)/2) {
					ch--;
				}else {
					ch++;
				}
				
			}

			//new line
			System.out.println();
		}
	}
}
