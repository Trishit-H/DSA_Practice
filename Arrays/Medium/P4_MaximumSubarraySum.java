// Kadane's Algorithm : Maximum Subarray Sum in an Array

// Problem Statement: Given an integer array nums, find the subarray with the 
// largest sum and return the sum of the elements present in that subarray.
// A subarray is a contiguous non-empty sequence of elements within an array.

package Arrays.Medium;

import java.util.Arrays;

public class P4_MaximumSubarraySum {

    public static int maxSubarray(int[] nums) {

        // stores the sum of the subarray we are currently building
        int currentSum = 0;

        // stores the maximum subarray sum found so far
        // start with MIN_VALUE because the array can contain all -ve values
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // add the current element to the current subarray
            currentSum = currentSum + nums[i];

            // update the maximum sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);

            // if the current sum becomes negative,
            // discard the current subarray and start fresh
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        // return the largest subarray sum found
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 4, -1, 7, 8 };

        System.out.println("Array = " + Arrays.toString(nums));
        System.out.println("Maximum Sum = " + maxSubarray(nums));
    }
}
