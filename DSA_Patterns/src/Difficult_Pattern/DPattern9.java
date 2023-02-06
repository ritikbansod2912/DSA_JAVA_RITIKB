/*
 * 
 	* * * * * * * * * *	[star , space ,star]	outer loop -> 1 to n
 	* * * *     * * * *				inner loop (star) -> 1 to n-i+1
 	* * *         * * *				inner loop (space) -> 1 to 2*i-2
 	* *             * *				inner loop (star) -> 1 to n-i+1
 	*                 *				PRINT *
 
 */
package Difficult_Pattern;

public class DPattern9 {
	public static void main(String[] args) {
		int n=5;

		//outer loop for total no. of rows
		for(int i=1;i<=n;i++) {

			//STAR
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}

			//SPACE
			for(int j=1;j<=2*i-2;j++) {
				System.out.print("  ");
			}

			//STAR
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}

			//new line
			System.out.println();
		}
	}
}
