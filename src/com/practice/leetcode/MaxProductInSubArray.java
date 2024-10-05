/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

/**
 * Given an array arr[] that contains positive and negative integers (may
 * contain 0 as well). Find the maximum product that we can get in a subarray of
 * arr.
 * 
 * Note: It is guarenteed that the output fits in 64-bit integer.
 * 
 * Examples
 * 
 * Input: arr[] = [6, -3, -10, 0, 2] Output: 180 Explanation: The subarray [6,
 * -3, -10] gives max product as 180.
 * 
 * @Author: Preeti Parna Sahoo
 */
public class MaxProductInSubArray {

	public static void main(String[] args) {
		
		int[] arr = {6, -3, -10, 0, 2}; 

		int maxProduct = findMaxProduct(arr);
		System.out.println(maxProduct);

	}

	private static int findMaxProduct(int[] arr) {
		// TODO Auto-generated method stub
		
		
		int maxSoFar = arr[0];
		int maxHere = arr[0];
		int minHere = arr[0];
		
		int len = arr.length;
		
		for(int i = 1 ; i < len ; i++) {
			int curr = arr[i];
			if ( curr < 0 ) {
				int temp = maxHere;
				maxHere = minHere;
				minHere = temp;
			}
			maxHere = Math.max(curr, maxHere * curr);
			minHere = Math.min(curr, minHere * curr);
			
			maxSoFar = Math.max(maxHere, maxSoFar);
		}
		return maxSoFar;
	}

}
