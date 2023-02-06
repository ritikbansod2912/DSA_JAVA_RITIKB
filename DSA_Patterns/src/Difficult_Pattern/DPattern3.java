/*
 	*
 	* *
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
		for(int i=1;i<=2*n-1;i++) {
			star=i;
			if(i>2*n/2) {
				star=2*n-i;
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
