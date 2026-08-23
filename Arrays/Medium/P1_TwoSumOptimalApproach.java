// Two Sum : Check if a pair with given sum exists in Array

// Problem Statement: Given an array of integers arr[] and an integer target.

// 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. 
// Otherwise, return NO.

// 2nd variant: Return indices of the two numbers such that their sum is equal to the target. 
// Otherwise, we will return {-1, -1}.

// NOTE = THIS SOLUTION WORKS ONLY FOR THE FIRST VARIANT

package Arrays.Medium;

import java.util.Arrays;

public class P1_TwoSumOptimalApproach {

    public static boolean twoSum(int[] arr, int target) {

        // array length
        int n = arr.length;

        // two pointer to find required pair
        int left = 0;
        int right = n - 1;

        // sort the array
        Arrays.sort(arr);

        while (left < right) {
            int sum = arr[left] + arr[right];

            // case 1: if sum is less than target
            // move the left pointer forward
            if (sum < target) {
                left++;
            }

            // case 2: if sum is more than target
            // move the right pointer backward
            else if (sum > target) {
                right--;
            }

            // case 3: sum equals target
            else {
                return true;
            }
        }

        // no pair found
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 6, 5, 8, 11 };
        int target = 14;

        System.out.println("Array: " + Arrays.toString(nums) + ", Target: " + target);
        System.out.println("Pair found? " + twoSum(nums, target));
    }
}
