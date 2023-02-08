/*
 		    1		[space, numebr, space ]		outer loop -> 1 to n
 		   2 2						inner loop (space) -> 1 to n-i
 		  3 3 3						inner loop (number) -> 1 to i
 		 4 4 4 4 
 		5 5 5 5 5
 */

package Difficult_Pattern;

public class DPattern13 {

	public static void main(String[] args) {
		int n=5;

		//outer loop for total no. of rows
		for(int i=1;i<=n;i++) {

			//SPACE
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}

			//NUMBER
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}

			//new line
			System.out.println();
		}
	}
}
