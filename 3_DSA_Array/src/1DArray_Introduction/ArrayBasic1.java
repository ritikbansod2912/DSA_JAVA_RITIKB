

public class ArrayBasic1 {
	
	public static void main(String[] args) {
		
		//Declaration of array
		int[] array1;
		
		float[] array2;
		
		char[] array3;
		
		String[] array4;
		
		// Initialization of array
		
		// case 1
		int[] a1=new int[5];
		a1[0]=11;
		a1[1]=12;
		a1[2]=13;
		a1[3]=14;
		a1[4]=15;
		
		// case 2
		int[] a2= {1,2,3,4,5};
		
		// case 3
		int[] a3=new int[]{10,9,8,7,6};
		
		//Traversing an array
		
		// case 1
		int j=0;
		while(j<a1.length) {
			System.out.println(a1[j]);
			j++;
		}
		
		// case 2
		for(int i=0;i<a2.length;i++) {
			System.out.println(a2[i]);
		}
		
		// case 3
		for(int i:a3 ) {
			System.out.println(i);
		}
				
	}
	
}
