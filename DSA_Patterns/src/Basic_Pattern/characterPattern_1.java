/*
 	A
 	A B
 	A B C
 	A B C D
 	A B C D E
 */
package Basic_Pattern;

public class characterPattern_1 {

	public static void main(String[] args) {
		int n=5;
		char ch;
		for(int i=1;i<=n;i++) {
			ch='A';
			for(int j=1;j<=i;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
