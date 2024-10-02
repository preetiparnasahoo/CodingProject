package com.practice.leetcode;

/*
 * Given an integer array arr, return all the unique pairs [arr[i], arr[j]] 
 such that i != j and arr[i] + arr[j] == 0.

Note: The pairs must be returned in sorted order, 
the solution array should also be sorted, and the answer must not contain any duplicate pairs.

Input: arr = [-1, 0, 1, 2, -1, -4]
Output: [[-1, 1]]
Explanation: arr[0] + arr[2] = (-1)+ 1 = 0.
arr[2] + arr[4] = 1 + (-1) = 0.
The distinct triplets are [-1,1].

Input: arr = [6, 1, 8, 0, 4, -9, -1, -10, -6, -5]
Output: [[-6, 6],[-1, 1]]
Explanation: The distinct triplets are [-1, 1] and [-6, 6].

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TwoSumTo0 {

	public static void main(String[] args) {
		int[] arr = {6, 1, 8, 0, 4, -9, -1, -10, -6, -5};
		System.out.println(getPairs(arr));

	}

	public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {

		Set<Integer> item = new HashSet<>();

		Set<List<Integer>> uniquePairs = new TreeSet<>((a, b) -> {
		    if (a.get(0).equals(b.get(0))) {
		        return a.get(1) - b.get(1);
		    }
		    return a.get(0) - b.get(0);
		});

		for (Integer val : arr) {
			int comp = -val;
			if (item.contains(comp)) {
				List<Integer> pair = Arrays.asList(Math.min(comp, val), Math.max(comp, val));
				uniquePairs.add(pair);
			}
			item.add(val);

		}
		

		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		for (List<Integer> pair : uniquePairs) {
			res.add(new ArrayList<>(pair));
		}
		return res;
	}

}
