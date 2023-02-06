/*
 	* * * * *		outer loop -> 1 to n
 	* * * *			inner loop -> n-i+1
 	* * *
 	* *
 	* 
 */
package Basic_Pattern;

public class Pattern4 {

	public static void main(String[] args) {
		int n=5;
		
		//onner loop for total no. of rows
		for(int i=1;i<=5;i++) {

			//inner loop for total no. of columns
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
