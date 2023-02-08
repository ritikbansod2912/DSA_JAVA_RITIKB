\

public class CloningAnArray5 {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		int[] cloneArray = array.clone();
		
		for(int i:array) {
			System.out.println(i);
		}
		System.out.println();
		for(int i: cloneArray) {
			System.out.println(i);
		}
		System.out.println();
		System.out.println(array.equals(cloneArray));
		
	}
}
