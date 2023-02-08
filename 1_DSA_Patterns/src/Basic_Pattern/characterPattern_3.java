/*
 	A B C D E		Outer loop -> 1 to n
 	A B C D			Inner loop -> 1 to n-i+1
 	A B C			PRINT ch 
 	A B
 	A 
 */
package Basic_Pattern;

public class characterPattern_3 {
	public static void main(String[] args) {
		int n=5;
		char ch;

		//outer loop for total no. of rows
		for(int i=1;i<=n;i++) {
			ch='A';

			//inner loop for total no. of columns
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
