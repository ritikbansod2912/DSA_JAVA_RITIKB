/*
 	      A
 	    A B A
 	  A B C B A
 	A B C D C B A
 */
package Difficult_Pattern;

public class DPattern7 {

	public static void main(String[] args) {
		int n=4;
		char ch;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			ch='A';
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(ch+" ");
				if(j>=(2*i)/2) {
					ch--;
				}else {
					ch++;
				}
				
			}
			System.out.println();
		}
	}
}
