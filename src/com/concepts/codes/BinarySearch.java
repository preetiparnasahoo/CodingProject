package com.concepts.codes;

public class BinarySearch {
	
	
	public static int searchElement(int[] arr, int low, int high, int s) {
		
		while( low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == s) {
				return mid;
			}
			else if (arr[mid] > s) 
				high = mid - 1;
			else
				low = mid + 1;
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		

		int[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
//		int[] arr = {10,15};
		System.out.println(searchElement(arr, 0, arr.length-1, 5));

	}

}
