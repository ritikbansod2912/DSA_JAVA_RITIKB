/*
 	A B C D E 
 	F G H I
 	J K L
 	M N
 	O
 */
package Basic_Pattern;

public class characterPattern_5 {

	public static void main(String[] args) {
		int n=5;
		char ch='A';
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}
	}
}
