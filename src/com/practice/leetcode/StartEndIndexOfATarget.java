/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

/**
 * @Author: Preeti Parna Sahoo
 */
public class StartEndIndexOfATarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {3,7,7,8,9};
		int target = 8;
		
		int start = findStartIndex(arr, target);
		int end = findEndIndex(arr,target);
		
		System.out.println(start + " " + end);

	}

	private static int findStartIndex(int[] arr, int target) {
		int startIndex = -1;
		int start = 0, end = arr.length - 1;
		
		while ( start <= end) {
			
			int mid = start + (end - start) / 2;
			
			if(arr[mid] >= target) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
			
			if (arr[mid] == target) {
				startIndex = mid;
			}
			
		}
		
		return startIndex;
	}

	private static int findEndIndex(int[] arr, int target) {
		int endIndex = -1;
		
		int start = 0, end = arr.length - 1;
		
		while (start <= end) {
			int mid = start + (end -start)/2;
			
			if(arr[mid] <= target) {
				start = mid + 1;
			}
			else {
				end = mid - 1;
			}
			
			if(arr[mid] == target) {
				endIndex = mid;
			}
		}
		
		return endIndex;
	}

}
