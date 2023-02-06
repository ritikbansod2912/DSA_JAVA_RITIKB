/*
 	1
 	0 1
 	1 0 1
 	0 1 0 1
 	1 0 1 0 1
 */
package Difficult_Pattern;

public class DPattern5 {

	public static void main(String[] args) {
		int n=5;
		int num;
		for(int i=1;i<=5;i++) {
			if(i%2!=0) {
				num=1;
			}else {
				num=0;
			}
			for(int j=1;j<=i;j++) {
				System.out.print(num+" ");
				num=1-num;
			}
			System.out.println();
		}
	}
}
