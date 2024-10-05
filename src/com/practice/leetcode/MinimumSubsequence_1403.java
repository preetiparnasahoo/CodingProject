/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given the array nums, obtain a subsequence of the array whose sum of elements
 * is strictly greater than the sum of the non included elements in such
 * subsequence.
 * 
 * If there are multiple solutions, return the subsequence with minimum size and
 * if there still exist multiple solutions, return the subsequence with the
 * maximum total sum of all its elements. A subsequence of an array can be
 * obtained by erasing some (possibly zero) elements from the array.
 * 
 * Note that the solution with the given constraints is guaranteed to be unique.
 * Also return the answer sorted in non-increasing order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [4,3,10,9,8] Output: [10,9] Explanation: The subsequences
 * [10,9] and [10,8] are minimal such that the sum of their elements is strictly
 * greater than the sum of elements not included. However, the subsequence
 * [10,9] has the maximum total sum of its elements.
 * 
 * @Author: Preeti Parna Sahoo
 */
public class MinimumSubsequence_1403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0,0,0,0,0};
		List<Integer> res = findSubsequence(arr);
		
		System.out.println(res);
		
	}

	private static List<Integer> findSubsequence(int[] nums) {
		List<Integer> res = new ArrayList<>();
		Arrays.sort(nums);	
		
		int sumA = 0;
		int sumB = 0;
		
		for (int i : nums) {
			sumB += i;
		}
		
		for (int i = nums.length - 1 ; i >=0 ; i--) {
			
			if(sumA <= sumB) {
				sumA += nums[i];
				sumB -= nums[i];
				res.add(nums[i]);
			}
			else 
				break;
		}
		return res;
	}

}
