package com.practice.leetcode;

public class RepeatedSubstringPattern_459 {

	public static boolean repeatedSubstringPattern(String s) {
        
		int len = s.length();
		
		
		for ( int i = len/2 ; i >= 1 ; i--) {
			if(len % i == 0) {
				int numRepeat = len / i;
				String substring = s.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0 ; j < numRepeat ; j++) {
					sb.append(substring);
					
				}
				if(sb.toString().equals(s)) {
					return true;
				}
				
			}
			
		}
		
		
		return false;
    }
	
	public static void main (String[] args) {
		
		String s = "ababab";
		
		System.out.println(repeatedSubstringPattern(s));
		
	}
}
