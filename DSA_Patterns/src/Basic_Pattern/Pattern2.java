/*
 	*			outer loop -> 1 to n
 	* *			inner loop -> 1 to i
 	* * *
 	* * * *
 	* * * * * 
 */
package Basic_Pattern;

public class Pattern2 {

	public static void main(String[] args) {
		int n=5;

		//outer loop for the no. of rows
		for(int i=1;i<=n;i++) {

			//inner loop for the no. of columns
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
