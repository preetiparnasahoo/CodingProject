package com.practice.leetcode;

import java.util.Arrays;

/**
 * Given an array arr[] denoting heights of N towers and a positive integer K.
 * 
 * For each tower, you must perform exactly one of the following operations
 * exactly once.
 * 
 * Increase the height of the tower by K Decrease the height of the tower by K
 * Find out the minimum possible difference between the height of the shortest
 * and tallest towers after you have modified each tower.
 * 
 * You can find a slight modification of the problem here. Note: It is
 * compulsory to increase or decrease the height by K for each tower. After the
 * operation, the resultant array should not contain any negative integers.
 * 
 * @Author: Preeti Parna Sahoo
 */
public class MinimizeTheHeights {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3, 9, 12, 16, 20};
		int k = 3;
		
		System.out.println(findMinHeightDiff(arr, k));

	}

	
	private static int findMinHeightDiff(int[] arr, int k) {
		// TODO Auto-generated method stub
		
		//Sort the array
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		int len = arr.length;
		
		int res = arr[len - 1] - arr[0];
		
		int smallest = arr[0] + k;
		int largest = arr[len - 1] - k;
		
		for (int i = 0 ; i < len - 1 ; i++) {
			
			int minTower = Math.min(smallest, arr[i+1] - k) ;
			int maxTower = Math.max(largest, arr[i] + k);
			
			if ( minTower < 0) continue;
			
			res = Math.min(res, maxTower - minTower);
			
		}
		
		return res;
	}

}
