/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of non-negative integers. Find the length of the longest
 * sub-sequence such that elements in the subsequence are consecutive integers,
 * the consecutive numbers can be in any order.
 * 
 * 
 * Example 1:
 * 
 * Input: N = 7 a[] = {2,6,1,9,4,5,3} Output: 6 Explanation: The consecutive
 * numbers here are 1, 2, 3, 4, 5, 6. These 6 numbers form the longest
 * consecutive subsquence.
 * 
 * @Author: Preeti Parna Sahoo
 */
public class LongestConsecutiveSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 9, 3, 10, 4, 20, 2};

		int findLength = findLongestConsecutiveSubsequence(arr);
		System.out.println(findLength);

	}

	private static int findLongestConsecutiveSubsequence(int[] arr) {
		// TODO Auto-generated method stub

		Set<Integer> set = new HashSet<>();

		for (int i : arr) {
			set.add(i);

		}

		int longestStreak = 0;

		for (int i : arr) {
			if (!set.contains(i - 1)) {
				int currentNum = i;
				int streak = 1;

				while (set.contains(currentNum + 1)) {
					currentNum++;
					streak++;
				}

				longestStreak = Math.max(streak, longestStreak);
			}

		}
		return longestStreak;
	}

}
