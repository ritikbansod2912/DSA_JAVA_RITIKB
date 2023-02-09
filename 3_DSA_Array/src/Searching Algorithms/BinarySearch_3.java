

public class BinarySearch_3 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int element=5;
		int index=binarySearch(array, element);
		if (index==-1)
			System.out.println("Element not found!!");
		else 
			System.out.println("Element found at index : "+index);
	}
	
	public static int binarySearch(int[] array,int element) {
		int start=0;
		int end=array.length-1;
		int mid=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(array[mid]==element) {
				return mid;
			}else if(array[mid]>element) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
}
