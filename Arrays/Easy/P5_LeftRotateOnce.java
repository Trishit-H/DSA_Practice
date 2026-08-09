// Left Rotate the Array by One

// Given an integer array nums, rotate the array to the left by one.
// Note: There is no need to return anything, just modify the given array.

package Arrays.Easy;

import java.util.Arrays;

public class P5_LeftRotateOnce {

    // function to left rotate an array by one
    public static void leftRotateByOne(int[] arr) {

        int arrLength = arr.length;

        // if array has less than 2 elements, rotation changes nothing
        if (arrLength < 2) {
            return;
        }

        // save the first element because it will be moved to the end
        int firstElement = arr[0];

        // shift every element one position to the left
        // start from index 0 because index 0 has no element before it
        for (int i = 1; i < arrLength; i++) {
            arr[i - 1] = arr[i];
        }

        // put the original first element at the last position
        arr[arrLength - 1] = firstElement;
    }

    // main function
    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 6, 9 };

        System.out.println("Original array: " + Arrays.toString(arr));
        leftRotateByOne(arr);
        System.out.println("Modified array: " + Arrays.toString(arr));
    }
}
