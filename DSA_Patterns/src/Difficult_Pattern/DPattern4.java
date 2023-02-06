/*
 		    *		[space , star , space]		outer loop 1 -> 1 to n
 		   ***						inner loop 1 (space) -> 1 to n-i 
 		  *****						inner loop 2 (star) -> 1 to 2*i-1
 		 *******
 		*********					outer loop 2 -> n to 1
 		*********					inner loop 1 (space) -> 1 to n-i
 		 *******					inner loop 2 (star) -> 1 to 2*i-1
 		  *****
 		   ***
 		    *
 */
package Difficult_Pattern;

public class DPattern4 {
public static void main(String[] args) {
		
		int n=5;

		//outer loop 1 for half pattern
		for(int i=1;i<=n;i++) {

			//inner loop for SPACE
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}

			//inner loop for STAR
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}

			//new line
			System.out.println();
		}

		//outer loop for 2nd half pattern
		for(int i=n;i>0;i--) {

			//inner loop for SPACE
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}

			//inner loop for STAR
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}

			//new line
			System.out.println();
		}
	}
}
