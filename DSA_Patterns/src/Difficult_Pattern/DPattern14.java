/*
 		    1		[space , number , space]	outer loop -> 1 to n
 		   212						inner loop (space) -> 1 to n-i
 		  32123						inner loop (number) -> 1 to 2*i-1
 		 4321234
 		543212345
 */
package Difficult_Pattern;

public class DPattern14 {
	public static void main(String[] args) {
		int n=5,num;

		//ouer loop for total no. of rows
		for(int i=1;i<=n;i++) {

			//SPACE
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			num=i;

			//NUMBER
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(num+" ");
				if(j>=2*i/2) {
					num++;
				}else {
					num--;
				}
				
			}

			//new line
			System.out.println();
		}
	}
}
