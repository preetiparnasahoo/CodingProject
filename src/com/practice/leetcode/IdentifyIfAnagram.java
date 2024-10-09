/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * Identify if two given strings are anagram of each other
 * @Author: Preeti Parna Sahoo
 */
public class IdentifyIfAnagram {

	public static void main(String[] args) {
		
		String str1 = "xyz";
		String str2 = "bca";
		
		Boolean ifAnagram = findIfAnagramWithGrequencyArray(str1.toCharArray(),str2.toCharArray());
		System.out.println(ifAnagram);

	}

	public static Boolean findIfAnagram(char[] str1, char[] str2) {
		// TODO Auto-generated method stub
		
		if (str1.length != str2.length) return false;
		
		Map<Character,Integer> map = new HashMap<>();
		
		for (char c : str1) {
			if (map.containsKey(c)) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}
			else
				map.put(c, 1);
		}
		
		for (char c : str2) {
			if (!map.containsKey(c)) {
				return false;
			}
			map.put(c, map.get(c) - 1);
			if(map.get(c) < 0) {
				return false;
			}
				
		}
		for (Integer count : map.values()) {
			if(count != 0) {
				return false;
			}
		}
		
		
		return true;
	}
	
	public static Boolean findIfAnagramWithGrequencyArray(char[] str1, char[] str2) {
	
		int[] str1Count = new int[26];
		int[] str2Count = new int[26];
		
		int s1Len = str1.length;
		int s2Len = str2.length;
		
		if (s1Len != s2Len) {
			return false;
		}
		
		//Find Frequency
		for (int i = 0 ; i < s1Len ; i++) {
			str1Count[str1[i] - 'a'] = str1Count[str1[i] - 'a'] + 1;
			str2Count[str2[i] - 'a'] = str2Count[str2[i] - 'a'] + 1;
		}
		
		//Validate each frequency
		for (int i = 0 ; i < 26 ; i++) {
			if(str1Count[i] != str2Count[i])
				return false;
		}
		return true;
		
		
	}

}
