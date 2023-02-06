/*
 	4 4 4 4 4 4 4 
 	4 3 3 3 3 3 4
 	4 3 2 2 2 3 4 
 	4 3 2 1 2 3 4
 	4 3 2 2 2 3 4
 	4 3 3 3 3 3 4
 	4 4 4 4 4 4 4 
 */
package Difficult_Pattern;

public class DPattern15 {
	public static void main(String[] args) {
		int n=4;
		int top,left,bottom,right;
		for(int i=1;i<=2*n-1;i++) {
			for(int j=1;j<=2*n-1;j++) {
				top=i;
				left=j;
				bottom=(2*n)-i;
				right=(2*n)-j;
				System.out.print(n+1-Math.min(Math.min(top, bottom),Math.min(left,right)));
			}
			System.out.println();
		}
	}
}
