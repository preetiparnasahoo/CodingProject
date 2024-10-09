/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.concepts.codes;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * To remove duplicate characters from a string while preserving the order of
 * their first appearance, you can use a Set to track the characters you've
 * already seen and build a result string with only unique characters.
 * 
 * @Author: Preeti Parna Sahoo
 */
public class RemoveDuplicateCharacter_LinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "geeksforgeeks";
		
		String modifiedS = removeDuplicates(s);
		
		System.out.println(modifiedS);

	}
	
	public static String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		
		Set<Character> set = new LinkedHashSet<>();
		
		for(char c:s.toCharArray()) {
			set.add(c);
		}
		
		for(char c : set) {
			sb.append(c);
		}
		return sb.toString();
	}

}
