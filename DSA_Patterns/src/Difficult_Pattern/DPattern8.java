/*
 	E
 	D E 
 	C D E
 	B C D E
 	A B C D E
 */
package Difficult_Pattern;

public class DPattern8 {

	public static void main(String[] args) {
		int n=5;
		char ch;
		for(int i=1;i<=n;i++) {
			ch=(char) (65+n-i);
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
