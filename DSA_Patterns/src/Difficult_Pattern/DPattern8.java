/*
 	E		outer loop -> 1 to n
 	D E 		inner loop -> 1 to i
 	C D E		PRINT char
 	B C D E
 	A B C D E
 */
package Difficult_Pattern;

public class DPattern8 {

	public static void main(String[] args) {
		int n=5;
		char ch;

		//outer loop for total no. of rows
		for(int i=1;i<=n;i++) {
			ch=(char) (65+n-i);

			// inner loop for total no. of columns
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}

			//new line
			System.out.println();
		}
	}
}
