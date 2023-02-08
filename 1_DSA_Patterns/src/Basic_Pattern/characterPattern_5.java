/*
 	A B C D E		outer loop -> 1 to n 
 	F G H I			inner loop -> 1 to n-i+1
 	J K L			PRINT char
 	M N
 	O
 */
package Basic_Pattern;

public class characterPattern_5 {

	public static void main(String[] args) {
		int n=5;
		char ch='A';

		//outer loop for total no. of rows
		for(int i=1;i<=n;i++) {

			//inner loop for total no. of columns
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
