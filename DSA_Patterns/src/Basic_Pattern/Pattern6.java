/*
  	1				outer loop -> 1 to n
  	2 3				inner loop -> 1 to i
  	4 5 6				PRINT num--> num++ --> num++
  	7 8 9 10
  	11 12 13 14 15
 */
package Basic_Pattern;

public class Pattern6 {
	public static void main(String[] args) {
		int n=5;
		int count=1;

		//outer loop for total no. of rows
		for(int i=1;i<=n;i++) {

			//inner loop for total no. of columns
			for(int j=1;j<=i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}
	}
}
