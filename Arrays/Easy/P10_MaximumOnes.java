// Count Maximum Consecutive One's in the array

// Given an array that contains only 1 and 0 return the count of 
// maximum consecutive ones in the array

package Arrays.Easy;

import java.util.Arrays;

public class P10_MaximumOnes {

    // function to return the maximum number of consecutive ones
    public static int maxOnes(int[] arr) {

        // array length
        int n = arr.length;

        int count = 0; // current consecutive 1's
        int maxCount = 0; // maximum consecutive 1's found

        // loop through the array
        for (int i = 0; i < n; i++) {

            if (arr[i] == 1) {
                count++; // extend current streak
            }

            if (count > maxCount) {
                maxCount = count; // update max count
            }

            if (arr[i] == 0) {
                count = 0;
            }
        }

        return maxCount; // return longest streak
    }

    // main function
    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 1, 1, 1, 0 };

        int maxCount = maxOnes(arr);

        System.out.println("Maximum consecutive ones in " + Arrays.toString(arr) + ": " + maxCount);
    }
}
