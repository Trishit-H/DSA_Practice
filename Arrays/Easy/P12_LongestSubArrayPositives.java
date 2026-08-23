// Longest Subarray with given Sum K(Positives)

// Given an array nums of size n and an integer k, find the length of the longest sub-array 
// that sums to k. If no such sub-array exists, return 0.

package Arrays.Easy;

import java.util.Arrays;

public class P12_LongestSubArrayPositives {

    // function to find the longest subarray with given sum k
    public static int longestSubArray(int[] arr, int k) {

        int n = arr.length;

        int left = 0;
        int right;
        int sum = 0;
        int maxLen = 0;

        // right expands the window
        for (right = 0; right < n; right++) {
            sum = sum + arr[right];

            // if sum exceeds k, shrink from left
            while (sum > k) {
                sum = sum - arr[left];
                left++;
            }

            // if sum equals k, check window length
            if (sum == k) {
                int length = right - left + 1;
                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen;
    }

    // main function
    public static void main(String[] args) {
        int[] nums = { 10, 5, 2, 7, 1, 9 };
        int k = 15;

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Longest subarray with sum " + k + " is = " + longestSubArray(nums, k));
    }
}
