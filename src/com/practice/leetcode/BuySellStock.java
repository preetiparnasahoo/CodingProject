package com.practice.leetcode;

public class BuySellStock {

	public static void main(String[] args) {

		int[] arr = {7,6,4,3,1};
		System.out.println(maxProfit(arr));
		
	}
	
	public static int maxProfit(int[] prices) {
		
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(Integer curr: prices) {
			if (curr < minPrice) {
				minPrice = curr;
			}
			int val = curr - minPrice;
			if ( val > maxProfit) {
				maxProfit = val;
			}
		}
		return maxProfit;
        
    }

}
