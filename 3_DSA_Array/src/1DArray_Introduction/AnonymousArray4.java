

public class AnonymousArray4 {
	
	public static void main(String[] args) {
		
		// Travesing Anonymous Array : new int[]{1,2,3,4,5};
		for(int i: new int[]{1,2,3,4,5}) {
			System.out.println(i);
		}
		
		// Passing an anonymous array to the method 
		print(new int[] {6,7,8,9,10});
	}
	
	public static void print(int[] array) {
		for(int i:array){
			System.out.println(i);
		}
	}
}
