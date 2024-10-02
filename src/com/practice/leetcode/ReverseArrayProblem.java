package com.practice.leetcode;

public class ReverseArrayProblem {

	public static void main(String[] args) {
		

		Integer[] arr = {1,2,3,4,5,6,7,8,9,10,11};
		
		ReverseArray(arr);
		
		for(Integer i:arr) {
			System.out.print(i + " ");
		}

	}

	private static void ReverseArray(Integer[] arr) {
		
		
		
		int len = arr.length - 1;
		int i = 0;
		
		while ( i < len) {
			int temp = arr[i];
			arr[i] = arr[len];
			arr[len] = temp;
			i++; len--;
		}
		
	}

}
