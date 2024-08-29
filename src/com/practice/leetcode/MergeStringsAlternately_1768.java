package com.practice.leetcode;

/*
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return the merged string.

 

Example 1:

Input: word1 = "abc", word2 = "pqr"
Output: "apbqcr"
Explanation: The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
 */
public class MergeStringsAlternately_1768 {
	
	
	public static String mergeAlternatelyMySolution(String word1, String word2) {

		StringBuilder s = new StringBuilder();

		int len1 = word1.length();
		int len2 = word2.length();

		int i;
		if (len1 <= len2) {
			for (i = 0; i < len1; i++) {
				s.append(word1.charAt(i));
				s.append(word2.charAt(i));
			}
			for (; i < len2; i++) {
				s.append(word2.charAt(i));
			}
		}
		else {
			for (i = 0; i < len2; i++) {
				s.append(word1.charAt(i));
				s.append(word2.charAt(i));
			}
			for (; i < len1; i++) {
				s.append(word1.charAt(i));
			}
		}
		
		return s.toString();
	}
	
	
	public static String mergeAlternatelySolution2(String word1, String word2) {
		
		int len1 = word1.length();
		int len2 = word2.length();
		
		StringBuilder s = new StringBuilder();
		
		int i = 0;
		
		while ( i < len1 || i < len2) {
			if( i < len1 ) {
				s.append(word1.charAt(i));
			}
			if( i < len2 ) {
				s.append(word2.charAt(i));
			}
			i++;
		}
		return s.toString();
	}

	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder();
		
		String word1 = "abc";
		String word2 = "pqrs";
		
		System.out.println(mergeAlternatelyMySolution(word1,word2));
		

	}

}
