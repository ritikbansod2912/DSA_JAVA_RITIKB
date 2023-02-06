/*
 	*	 		outer loop -> 1 to 2*n-1
 	* *			inenr loop -> i to star
 	* * *
 	* * * *
 	* * * * *
 	* * * *
 	* * *
 	* * 
 	* 
 */
package Difficult_Pattern;

public class DPattern3 {

	public static void main(String[] args) {
		int n=5, star;
		
		//outer loop for total no. of rows
		for(int i=1;i<=2*n-1;i++) {
			star=i;
			if(i>2*n/2) {
				star=2*n-i;
			}

			//inner loop for STAR
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}

			//new line
			System.out.println();
		}
	}
}
