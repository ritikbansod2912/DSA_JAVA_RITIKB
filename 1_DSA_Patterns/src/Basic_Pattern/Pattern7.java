/*
  	1 			outer loop -> 1 to n
  	2 2			inner loop -> 1 to i
  	3 3 3			PRINT i
  	4 4 4 4
  	5 5 5 5 5 
 */
package Basic_Pattern;

public class Pattern7 {

	public static void main(String[] args) {
		int n=5;

		//Outer loop for total no. of rows
		for(int i=1;i<=n;i++) {

			//inner loop for total no. of columns
			for(int j=1;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
