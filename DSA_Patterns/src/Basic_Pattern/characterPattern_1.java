/*
 	A		outer loop -> 1 to n
 	A B		inner loop -> 1 to i
 	A B C		PRINT char 
 	A B C D
 	A B C D E
 */
package Basic_Pattern;

public class characterPattern_1 {

	public static void main(String[] args) {
		int n=5;
		char ch;

		//Outer loop for total no. of rows
		for(int i=1;i<=n;i++) {
			ch='A';

			//inner loop for total no. of columns
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
