/*
 	        * * * * *	[space , star]		outer loop -> 1 to n
 	      * * * * *					inner loop (space) -> 1 to n-1
 	    * * * * *					inner loop (star) -> 1 to n
 	  * * * * *
 	* * * * *
 */
package Difficult_Pattern;

public class DPattern12 {
	public static void main(String[] args) {
		int n=5;

		//outer loop for total no. of rows
		for(int i=1;i<=n;i++) {

			//SPACE
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}

			//STAR
			for(int j=1;j<=n;j++) {
				if(i==1||i==n||j==1||j==n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}

			//new line
			System.out.println();
		}
	}
}
