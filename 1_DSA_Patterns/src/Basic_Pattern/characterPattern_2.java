/*
 	A             		outer loop -> 1 to n
 	B B			inner loop -> 1 to i
 	C C C			PRINT ch for value of i
 	D D D D
 	E E E E E
 */
package Basic_Pattern;

public class characterPattern_2 {
	public static void main(String[] args) {
		int n=5;
		char ch='A';

		//outer loops for total no. of rows
		for(int i=1;i<=n;i++) {

			//inner loop for total no. of columns
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
	}
}
