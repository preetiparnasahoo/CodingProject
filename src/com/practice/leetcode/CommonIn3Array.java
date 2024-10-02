/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Preeti Parna Sahoo
 */
public class CommonIn3Array {

	public static void main(String[] args) {

		int[] arr1 = { 1, 5, 10, 20, 40, 80 };
		int[] arr2 = { 6, 7, 20, 80, 100 };
		int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };

		List<Integer> commonItem = findList(arr1, arr2, arr3);

		for (Integer i : commonItem) {
			System.out.print(i + ", ");
		}

	}

	private static List<Integer> findList(int[] arr1, int[] arr2, int[] arr3) {

		List<Integer> commonItem = new ArrayList<>();
		int len1 = arr1.length;
		int len2 = arr2.length;
		int len3 = arr3.length;

		int i = 0, j = 0, k = 0;

		while (i < len1 && j < len2 && k < len3) {
			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
				
				commonItem.add(arr1[i]);
				
				int item = arr1[i];
				while ( i < len1 && arr1[i] == item ) i++;
				while ( j < len2 && arr2[j] == item ) j++;
				while ( k < len3 && arr3[k] == item ) k++;
			} else if (arr1[i] < arr2[j])
				i++;
			else if (arr2[j] < arr3[k])
				j++;
			else
				k++;
		}

		return commonItem;
	}

}
