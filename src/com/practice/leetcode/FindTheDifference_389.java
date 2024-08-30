package com.practice.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindTheDifference_389 {
	
	
	public static char findTheDifference(String s, String t) {
		
		
		List<Character> list = new ArrayList<Character>();
		
		for ( Character c : s.toCharArray()) {
			list.add(c);
		}
		
		for (Character c : t.toCharArray()) {
			if(list.contains(c)) {
				list.remove(c);
			}
			else 
				return c;
		}
		
		return (Character) null;
		 
		
	}
	

	public static void main(String[] args) {
		

		System.out.println(findTheDifference("a", "aa"));

	}

}
