/*
 			1
 		   212
 		  32123
 		 4321234
 		543212345
 */
package Difficult_Pattern;

public class DPattern14 {
	public static void main(String[] args) {
		int n=5,num;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("  ");
			}
			num=i;
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(num+" ");
				if(j>=2*i/2) {
					num++;
				}else {
					num--;
				}
				
			}
			System.out.println();
		}
	}
}
