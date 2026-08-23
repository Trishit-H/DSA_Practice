// Length of the longest subarray with zero Sum

// Given an array containing both positive and negative integers, we have to find 
// the length of the longest subarray with the sum of all elements equal to zero.

package Arrays.Easy;

import java.util.Arrays;
import java.util.HashMap;

public class P13_LongestSubarraySumZero {

    // function to return the length of the longest subarray
    // with sum = 0
    public static int longestSubarrayWhereSumZero(int[] arr) {

        int n = arr.length;

        // hashmap to store the prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {

            // keep adding elements to get the prefix sum
            sum = sum + arr[i];

            // if sum is 0, then subarray from index 0 to i has sum 0
            if (sum == 0) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // if this sum was seen before
            if (map.containsKey(sum)) {

                // elements between previous index and i have sum 0
                int length = i - map.get(sum);

                // keep the longest subarray
                maxLen = Math.max(maxLen, length);
            } else {

                // store only the first occurence
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    // main functon
    public static void main(String[] args) {
        int[] nums = { 9, -3, 3, -1, 6, -5 };

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Longest subarray with sum zero: " + longestSubarrayWhereSumZero(nums));
    }
}
