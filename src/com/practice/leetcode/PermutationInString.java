/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

import java.util.List;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1,
 * or false otherwise.
 * 
 * In other words, return true if one of s1's permutations is the substring of
 * s2.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s1 = "ab", s2 = "eidbaooo" Output: true Explanation: s2 contains one
 * permutation of s1 ("ba"). Example 2:
 * 
 * Input: s1 = "ab", s2 = "eidboaoo" Output: false
 * 
 * @Author: Preeti Parna Sahoo
 */
public class PermutationInString {

	public static void main(String[] args) {
		
		String s1 = "ab";
		String s2 = "eidbaooo";
		System.out.println(checkInclusion(s1,s2));

	}

	public static boolean checkInclusion(String s1, String s2) {

		List<Integer> res = FindAllAnagramsInAString_438.findAnagrams(s2, s1);
		System.out.println(res);

		return res.isEmpty() ? false : true;
	}

}
