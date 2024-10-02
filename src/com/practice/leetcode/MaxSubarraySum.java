package com.practice.leetcode;


/**
 * The problem is to find the maximum sum possible from all the subarrays of an integer array. This is known as the maximum subarray problem, and we can use Kadane's Algorithm to solve this in linear time.

Problem:
Given an integer array arr[], find and return the maximum sum possible from all subarrays.

Example:
Input: arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Output: 6 (The subarray [4, -1, 2, 1] has the maximum sum)
Approach: Kadane's Algorithm
Initialization:

We initialize two variables: maxSum and currentSum.
maxSum will store the maximum subarray sum found so far.
currentSum will store the sum of the current subarray.
Traverse the array:

For each element in the array, update the currentSum as the maximum between the current element itself or the sum of the currentSum plus the current element.
This way, if adding the current element makes the sum worse (i.e., smaller), we start a new subarray from that element.
Update maxSum if currentSum is larger than maxSum.
Return:

At the end of the traversal, maxSum will contain the maximum possible subarray sum.

 */
public class MaxSubarraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
		
		
		int[] arr = {-6, -1, -8, -4, -9, -1, -10, -6, -5, 0};
		
//		int[] arr = {};
		System.out.println(findMaxSum(arr));

	}

	private static int findMaxSum(int[] arr) {
		
		if (arr == null | arr.length == 0) {
			throw new IllegalArgumentException("Input array cannot be empty");
		}
		
		int maxSum = arr[0];
		int currSum = arr[0];
		
		for (int i = 1 ; i < arr.length ; i++) {
			currSum = Math.max(arr[i], currSum + arr[i]);
			maxSum = Math.max(maxSum, currSum);
		}
		
		return maxSum;
	}

}
