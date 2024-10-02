package com.practice.leetcode;

public class FindMinAndMaxInArray {

	public static void main(String[] args) {
		

		Integer[] arr = {-1,12,33,-4,15,6200,70,18,29,120,-1100};
		
		System.out.println("Minimum Element = " + findMin(arr));
		System.out.println("Maximum Element = " + findMax(arr));

	}

	private static Integer findMax(Integer[] arr) {
		
		int max = Integer.MIN_VALUE;
		for(Integer i : arr) {
			if ( max < i ) {
				max = i;
			}
		}
		return max;
	}

	private static Integer findMin(Integer[] arr) {
		
		int min = Integer.MAX_VALUE;
		for(Integer i : arr) {
			if ( min > i ) {
				min = i;
			}
		}
		return min;
	}

}
