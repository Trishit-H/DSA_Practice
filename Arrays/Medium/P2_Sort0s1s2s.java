// Sort an array of 0s, 1s and 2s

// Given an array nums consisting of only 0, 1, or 2. Sort the array in non-decreasing order. 
// The sorting must be done in-place, without making a copy of the original array.

package Arrays.Medium;

import java.util.Arrays;

public class P2_Sort0s1s2s {

    // Sorts an array of 0s, 1s, 2s in-place using Dutch National Flag algorithm
    public static void sortArrayOf0s1s2s(int[] nums) {

        // boundary: end of 0s zone
        int low = 0;
        // scanner: current unexplored element
        int mid = 0;
        // boundary: start of 2s zone
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {
                // place 0 at its correct spot
                swap(nums, mid, low);
                // grow 0s zone
                low++;
                // safe to move on, nums[old low] was a 1
                mid++;
            }

            else if (nums[mid] == 1) {
                // 1 already in correct zone, just move on
                mid++;
            }

            else { // nums[mid] == 2
                   // place 2 at its correct spot
                swap(nums, mid, high);
                // shrink unexplored zone from the right
                high--;
                // mid NOT incremented — nums[high] before swap was unexplored, must recheck
            }
        }
    }

    // Swaps two elements in an array given their indices
    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    // main function
    public static void main(String[] args) {
        int[] nums = { 1, 0, 2, 1, 0 };

        System.out.println("Original array = " + Arrays.toString(nums));

        sortArrayOf0s1s2s(nums);

        System.out.println("Sorted array = " + Arrays.toString(nums));
    }
}
