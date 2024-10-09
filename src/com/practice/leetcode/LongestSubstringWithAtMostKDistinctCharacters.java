/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string s and an integer k, return the length of the longest substring
 * of s that contains at most k distinct characters.
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 5 * 10^4 0 <= k <= s.length s consists of English letters.
 * 
 * Input: s = "eceba", k = 2 Output: 3 Explanation: The substring is "ece" with
 * length 3.
 * 
 * 
 * Input: s = "aa", k = 1 Output: 2 Explanation: The substring is "aa" with
 * length 2.
 * 
 * 
 * @Author: Preeti Parna Sahoo
 */
public class LongestSubstringWithAtMostKDistinctCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "eceba";
		int k = 2;

		int maxLength = findMaxLengthSubstring(s, k);
		System.out.println(maxLength);
	}

	private static int findMaxLengthSubstring(String s, int k) {
		// TODO Auto-generated method stub
		
		if(s == null | s.length() == 0 | k == 0) {
		return 0;
		}
		
		int maxLength = 0;
		int start = 0;
		
		
		Map<Character,Integer> map = new HashMap<>();
		
		for (int end = 0 ; end < s.length() ; end++) {
			char rightChar = s.charAt(end);
			map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);
			
			//Shrink the window until there are only k distinct elements
			
			while(map.size() > k) {
				char leftChar = s.charAt(start);
				map.put(leftChar, map.get(leftChar) - 1);
				if(map.get(leftChar) == 0) {
					map.remove(leftChar);
				}
				start++;
				
			}
			
			maxLength = Math.max(maxLength, end - start + 1);
		}
		
		
		
		return maxLength;
	}

}
