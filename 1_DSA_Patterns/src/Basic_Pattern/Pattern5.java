/*
 	1 2 3 4 5		outer loop -> 1 to n
 	1 2 3 4			inner loop -> 1 to n-i+1
 	1 2 3			PRINT j
 	1 2
 	1
 */
package Basic_Pattern;

public class Pattern5 {

	public static void main(String[] args) {
		int n=5;

		//outer loop for total no. of rows
		for(int i=1;i<=n;i++) {

			//inner loop for total no. of columns
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
