/*
  		* * * * *	outer loop -> 1 to n
  		* * * * *	inner loop -> 1 to n
  		* * * * *
  		* * * * * 
  		* * * * * 
 */

package Basic_Pattern;

public class Pattern1 {
	
	public static void main(String[] args) {
		int n=5;

		//Outer loop for no. of rows
		for(int i=1;i<=5;i++) {

			//Inner loop for no. of columns
			for(int j=1;j<=n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
