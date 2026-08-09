// Rotate array by K elements

// Given an array of integers, rotating array of elements by k elements either left or right.

package Arrays.Easy;

import java.util.Arrays;

public class P6_RotateByK {

    // function to rotate array k times
    public static void rotateByK(int[] arr, int k, boolean right) {

        // array length
        int n = arr.length;

        // if array has less than 2 elements, then rotation changes nothing
        if (n < 2) {
            return;
        }

        // reduce k if it is greater than or equal to n
        k = k % n;

        // if the rotate by right, then it means rotate left by n - k times
        if (right) {
            k = (n - k) % n;
        }

        // reverse the first k elements
        reverse(arr, 0, k - 1);

        // reverse remaining elements
        reverse(arr, k, n - 1);

        // reverse the entire thing
        reverse(arr, 0, n - 1);
    }

    // function to reverse an array in-place using two pointers technique
    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // main function
    public static void main(String[] args) {

        int k = 3;

        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        System.out.println("Original array: " + Arrays.toString(nums));
        rotateByK(nums, k, false);
        System.out.println("Left rotating by 3 places: " + Arrays.toString(nums));

        System.out.println();

        int[] nums2 = { 10, 20, 30, 40, 50, 60, 70 };
        System.out.println("Original array: " + Arrays.toString(nums2));
        rotateByK(nums2, k, true);
        System.out.println("Right rotating by 3 places: " + Arrays.toString(nums2));
    }
}
