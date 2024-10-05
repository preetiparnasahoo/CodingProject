/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

/**
 * Problem: Given an array of integers, find the maximum sum of a subarray of
 * size k. Example: Input: arr = [2, 1, 5, 1, 3, 2], k = 3 Output: 9
 * Explanation: Subarray with maximum sum is [5, 1, 3]. Concept: Use a sliding
 * window of size k to calculate the sum of subarrays. Problem Link: Sliding
 * Window Maximum Sum of K Elements (Leetcode Discuss)
 * 
 * @Author: Preeti Parna Sahoo
 */
public class MaximumSumSubarrayOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] nums = { 2, 1, 5, 1, 3, 2 };
		
		int[] nums = {5, 5, 5, 5, 5};
		int k = 2;

		int res = maxSlidingWindow(nums, k);
		
		System.out.println(res);

	}

	public static int maxSlidingWindow(int[] nums, int k) {
				
		int maxSum = 0;
		
		if (k > nums.length) {
			throw new IllegalArgumentException("Invalid input. k cannot be greater than array size");
		}
		for (int i = 0 ; i < k ; i++) {
			maxSum += nums[i];
		}
		
		int currSum = maxSum;
		for(int i = k ; i < nums.length ; i++) {
			currSum = currSum + nums[i] - nums[i - k];
			maxSum = Math.max(maxSum, currSum);
		}
		
		return maxSum;

	}

}
