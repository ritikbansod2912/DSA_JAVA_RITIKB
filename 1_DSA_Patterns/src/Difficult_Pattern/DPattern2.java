/*
 		*********	[space , star , space]		outer loop -> n to 1
 		 *******					inner loop 1 (space) -> 1 to  n-i 
 		  *****						inner loop 2 (star)  -> 1 to 2*i-1
 		   ***						inenr loop 3 (space) -> 1 to n-i (could be skipped)
 		    *
 */
package Difficult_Pattern;

public class DPattern2 {
	public static void main(String[] args) {
		int n=5;

		//Outer loop for total no.of rows
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
