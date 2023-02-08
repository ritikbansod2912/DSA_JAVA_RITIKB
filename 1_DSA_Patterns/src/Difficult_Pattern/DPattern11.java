/*
 	*                 *		[star , space , star]	outer loop for first half -> i to n
 	* *             * *					inner loop (star) -> 1 to i
 	* * *         * * *					inner loop (space) -> 1 to 2*(n-1)
 	* * * *     * * * * 					inner loop (star) -> 1 to i	
 	* * * * * * * * * *
 	* * * * * * * * * *					outer loop for second half -> n to 1
 	* * * *     * * * * 					inner loop (star) -> 1 to i
 	* * *         * * *					inner loop (space) -> 1 to 2*(n-1)
 	* *             * *					inner loop (star) -> 1 to i
 	*                 *
 */
package Difficult_Pattern;

public class DPattern11 {
	public static void main(String[] args) {
		int n=5;

		//outer loop 1
		for(int i=1;i<=5;i++) {

			//STAR
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}

			//SPACE
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print("  ");
			}

			//STAR
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}

			//new line
			System.out.println();
		}

		//outer loop 2
		for(int i=n;i>0;i--) {

			//STAR
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}

			//SPACE
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print("  ");
			}

			//STAR
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}

			//new line
			System.out.println();
		}
	}
}
