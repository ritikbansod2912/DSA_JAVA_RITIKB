/*
 	A B C D E
 	A B C D
 	A B C
 	A B
 	A 
 */
package Basic_Pattern;

public class characterPattern_3 {
	public static void main(String[] args) {
		int n=5;
		char ch;
		for(int i=1;i<=n;i++) {
			ch='A';
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
