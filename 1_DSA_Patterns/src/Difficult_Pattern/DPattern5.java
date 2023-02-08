/*
 	1		outer loop -> 1 to n
 	0 1		inner loop -> 1 to i
 	1 0 1		PRINT num
 	0 1 0 1
 	1 0 1 0 1
 */
package Difficult_Pattern;

public class DPattern5 {

	public static void main(String[] args) {
		int n=5;
		int num;

		//outer loop for total no. of rows
		for(int i=1;i<=5;i++) {
			if(i%2!=0) {
				num=1;
			}else {
				num=0;
			}

			//inner loop for total no. of columns
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=1-num;
			}
			System.out.println();
		}
	}
}
