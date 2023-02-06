/*
 	1               outer loop -> 1 to n
 	1 2		inner loop -> 1 to i
 	1 2 3		PRINT j
 	1 2 3 4
 	1 2 3 4 5
 */
package Basic_Pattern;

public class Pattern3{

	public static void main(String[] args) {
		int n=5;

		//Outer loop for the no. of rows
		for(int i=1;i<=n;i++) {

			//Inner loop for the no. of columns
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
