/*
 	A			Outer Loop -> 1 to n
 	B C 			Inner loop -> 1 to i
 	D E F			PRINT char
 	G H I J 
 	K L M N O
 */
package Basic_Pattern;

public class characterPattern_4 {
	public static void main(String[] args) {
		
		int n=5;
		char ch='A';

		//outer loop for total no. of rows
		for(int i=1;i<=5;i++) {

			//inner loop for total no. of columns
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}
}
