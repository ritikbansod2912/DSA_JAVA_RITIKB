/*
 	4 4 4 4 4 4 4 		outer loop -> 1 to n
 	4 3 3 3 3 3 4		inner loop -> 1 to n
 	4 3 2 2 2 3 4 
 	4 3 2 1 2 3 4		top = i;
 	4 3 2 2 2 3 4		left = j;
 	4 3 3 3 3 3 4		bottom = (2*n)-i;
 	4 4 4 4 4 4 4 		right = (2*n)-j;

				n-Math.min( Math.min(top,bottom) , Math.min(left,right));
 */
package Difficult_Pattern;

public class DPattern15 {
	public static void main(String[] args) {
		int n=4;
		int top,left,bottom,right;

		//outer loop for total no. of rows
		for(int i=1;i<=2*n-1;i++) {

			//inner loop for total no. of colums
			for(int j=1;j<=2*n-1;j++) {

				//matrix position of elements from all sides
				top=i;
				left=j;
				bottom=(2*n)-i;
				right=(2*n)-j;

				//condition
				System.out.print(n+1-Math.min(Math.min(top, bottom),Math.min(left,right)));
			}

			//new line
			System.out.println();
		}
	}
}
