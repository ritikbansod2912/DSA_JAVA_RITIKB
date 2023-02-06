/*
 	*                 *
 	* *             * *
 	* * *         * * *
 	* * * *     * * * * 
 	* * * * * * * * * *
 	* * * * * * * * * *
 	* * * *     * * * * 
 	* * *         * * *
 	* *             * *
 	*                 *
 */
package Difficult_Pattern;

public class DPattern11 {
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int j=1;j<=2*(n-i);j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
