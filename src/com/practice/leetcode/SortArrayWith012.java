package com.practice.leetcode;

public class SortArrayWith012 {

	public static void main(String[] args) {

		
		Integer[] arr = {0,1,0,1,2,1,0,1,0,0,2,2,1};
		
		int len = arr.length;
		int low = 0;
		int mid = 0;
		int high = len - 1;
		
		while ( mid <= high) {
			switch(arr[mid]) {
			case 0:
				swap(arr, low, mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(arr, mid, high);
				high--;
				break;
			}
		}
			
		
		for(Integer x : arr) {
			System.out.print(x + " ");
		}
	}

	private static void swap(Integer[] arr, Integer integer, Integer integer2) {

		Integer temp = arr[integer];
		arr[integer] = arr[integer2];
		arr[integer2] = temp;
	}

}
