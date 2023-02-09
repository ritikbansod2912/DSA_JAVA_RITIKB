

import java.util.Scanner;

public class LinearSearch_1 {
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5};
		int element=5;
		int index=linearSearch(array, element);
		if(index==-1)
			System.out.println("Element Not Found!!");
		else
			System.out.println("Element found at index : "+index);
	}
	
	public static int linearSearch(int[] array , int element) {
		for(int i=0;i<array.length;i++) {
			if(element==array[i]) {
				return i;
			}
		}
		return -1;
	}
}
