// Two Sum : Check if a pair with given sum exists in Array

// Problem Statement: Given an array of integers arr[] and an integer target.

// 1st variant: Return YES if there exist two numbers such that their sum is equal to the target. 
// Otherwise, return NO.

// 2nd variant: Return indices of the two numbers such that their sum is equal to the target. 
// Otherwise, we will return {-1, -1}.

package Arrays.Medium;

import java.util.Arrays;
import java.util.HashMap;

public class P1_TwoSumBetterApproach {

    public static int[] twoSum(int[] arr, int target) {

        // HashMap stores: number -> index
        HashMap<Integer, Integer> map = new HashMap<>();

        // traverse the array
        for (int i = 0; i < arr.length; i++) {

            // find the number needed to reach the target
            int needed = target - arr[i];

            // check if we have already seen the number
            if (map.containsKey(needed)) {

                // pair found: return the index of needed and current index
                return new int[] { map.get(needed), i };

            } else {

                // store the current element and its index
                map.put(arr[i], i);
            }
        }

        // no pair found
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 6, 5, 8, 11 };
        int target = 14;

        System.out.println("Array: " + Arrays.toString(nums) + ", Target: " + target);
        System.out.println("Indices: " + Arrays.toString(twoSum(nums, target)));
    }
}
