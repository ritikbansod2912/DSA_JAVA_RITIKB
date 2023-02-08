
public class Array_PassByReference3 {
	public static void main(String[] args) {
		
		int arr[]= {0,1,2,3,4};
		UpdateArrayBy1(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	public static void UpdateArrayBy1(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			arr[i]+=1;
		}
	}
}
