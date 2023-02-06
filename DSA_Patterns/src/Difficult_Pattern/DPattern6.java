/*
 	1             1		[number , space , num]		outer loop -> 1 to n
 	1 2         2 1						inner loop (number) -> 1 to i
 	1 2 3     3 2 1						inner loop (space) -> 1 to 2*(n-1)
 	1 2 3 4 4 3 2 1						inner loop (number) -> 1 to i
 */
package Difficult_Pattern;

public class DPattern6 {
	public static void main(String[] args) {
		int n=4;

		//outer loop for total no. of rows
		for(int i=1;i<=n;i++) {

			//NUMBER
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}

			//SPACE
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print("  ");
			}

			//NUMBER
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}

			//new line
			System.out.println();
		}
	}
}
