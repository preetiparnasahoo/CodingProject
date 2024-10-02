/**
 * 
 * @Author: Preeti Parna Sahoo
 */
package com.practice.leetcode;

/**
 * Given an array arr[] of non-negative integers. Each array element represents
 * the maximum length of the jumps that can be made forward from that element.
 * This means if arr[i] = x, then we can jump any distance y such that y ≤ x.
 * Find the minimum number of jumps to reach the end of the array starting from
 * the first element. If an element is 0, then you cannot move through that
 * element. Note: Return -1 if you can't reach the end of the array.
 * 
 * Examples :
 * 
 * Input: arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} Output: 3 Explanation:First
 * jump from 1st element to 2nd element with value 3. From here we jump to 5th
 * element with value 9, and from here we will jump to the last.
 * 
 * @Author: Preeti Parna Sahoo
 */
public class MinimumJumps {

    // Function to calculate the minimum number of jumps to reach the end
    public static int minJumps(int[] arr) {
        int n = arr.length;

        // If array length is 1, we are already at the last element
        if (n == 1) {
            return 0;
        }

        // If the first element is 0, we can't make any jump
        if (arr[0] == 0) {
            return -1;
        }

        // Initialize variables
        int maxReach = arr[0]; // The maximum index we can reach
        int steps = arr[0];    // Steps we can still take
        int jumps = 1;         // We always need at least one jump (starting at the first element)

        // Traverse the array
        for (int i = 1; i < n; i++) {
            // If we have reached the last element, return the number of jumps
            if (i == n - 1) {
                return jumps;
            }

            // Update the maximum reachable index
            maxReach = Math.max(maxReach, i + arr[i]);

            // Use a step to move forward
            steps--;

            // If no steps are left
            if (steps == 0) {
                // We must have used a jump
                jumps++;

                // Check if we can reach further
                if (i >= maxReach) {
                    return -1; // If we can't move further, return -1
                }

                // Reinitialize the steps to the amount of steps we can take from the current index
                steps = maxReach - i;
            }
        }

        // If we complete the loop without reaching the last element, return -1
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 1, 3, 5, 8, 6, 2, 6, 7, 6, 8, 0, 9};
        System.out.println("Minimum number of jumps: " + minJumps(arr));  // Output: 3
    }
}
