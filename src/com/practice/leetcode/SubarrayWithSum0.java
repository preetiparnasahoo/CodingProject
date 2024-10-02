/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers. Find if there is a subarray (of size at-least
 * one) with 0 sum. You just need to return true/false depending upon whether
 * there is a subarray present with 0-sum or not. Printing will be taken care by
 * the driver code. Example 1:
 * 
 * Input: n = 5 arr = {4,2,-3,1,6} Output: Yes Explanation: 2, -3, 1 is the
 * subarray with sum 0.
 * 
 * @Author: Preeti Parna Sahoo
 */
public class SubarrayWithSum0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = { 4, 2, -3, 1, 6 };
		int[] arr = { -91, 1 };
		boolean exist = isExistSum0(arr);
		System.out.println(exist);

	}

	private static boolean isExistSum0(int[] arr) {
		// TODO Auto-generated method stub

		Set<Integer> prefixSumSet = new HashSet<>();

		int prefixSum = 0;

		for (Integer i : arr) {
			prefixSum += i;

			if (prefixSum == 0 || prefixSumSet.contains(prefixSum)) {
				return true;
			}
			prefixSumSet.add(prefixSum);
		}
		return false;
	}

}
