/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array of integers nums containing n + 1 integers where each integer
 * is in the range [1, n] inclusive.
 * 
 * There is only one repeated number in nums, return this repeated number.
 * 
 * You must solve the problem without modifying the array nums and using only
 * constant extra space.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,3,4,2,2] Output: 2
 * 
 * @Author: Preeti Parna Sahoo
 */
public class FindDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = { 3, 3, 3, 3, 3 };
		
//		int[] arr = {1, 3, 4, 2, 2}; 
		int[] arr = {2,5,9,6,9,3,8,9,7,1};

		findDuplicate(arr);

	}

	private static void findDuplicate(int[] arr) {
		// TODO Auto-generated method stub

		int tortoise = arr[0];
		int hare = arr[0];
		
		do {
			tortoise = arr[tortoise];
			hare = arr[arr[hare]];
		}while ( tortoise != hare );
		
		tortoise = arr[0];
		while (tortoise != hare) {
			tortoise = arr[tortoise];
			hare = arr[hare];
		}
		
		System.out.println(hare);

	}

}
