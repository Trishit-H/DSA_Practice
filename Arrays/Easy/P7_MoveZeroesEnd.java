// Move all Zeros to the end of the array

// You are given an array of integers, your task is to move all the zeros 
// in the array to the end of the array and move non-negative integers to the 
// front by maintaining their order.

package Arrays.Easy;

import java.util.Arrays;

public class P7_MoveZeroesEnd {

    // function to move zeroes to end of the array
    public static void moveZeroes(int[] arr) {

        // length of the array
        int n = arr.length;

        // find the first zero
        int pointer1 = 0;

        while (pointer1 < n && arr[pointer1] != 0) {
            pointer1++;
        }

        // start searching for non-zero elements
        // after finding the first element
        int pointer2 = pointer1 + 1;

        while (pointer2 < n) {

            // found a non-zero elements
            if (arr[pointer2] != 0) {

                // swap the non-zero element with zero element
                int temp = arr[pointer1];
                arr[pointer1] = arr[pointer2];
                arr[pointer2] = temp;

                // move pointer to the next zero
                pointer1++;
            }

            // continue searching
            pointer2++;
        }
    }

    // main function
    public static void main(String[] args) {

        int[] nums = { 0, 1, 0, 3, 12 };

        System.out.println("Original array: " + Arrays.toString(nums));
        moveZeroes(nums);
        System.out.println("Modified array: " + Arrays.toString(nums));
    }
}
