// Rearrange Array Elements by Sign

// There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. 
// Without altering the relative order of positive and negative elements, you must return an 
// array of alternately positive and negative values.

package Arrays.Medium;

import java.util.Arrays;

public class P8_RearrangeArrayElementsBySignOptimal {

    public static int[] rearrangeElements(int[] arr) {

        int[] result_arr = new int[arr.length];

        int positive_index = 0;
        int negative_index = 1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                result_arr[positive_index] = arr[i];
                positive_index += 2;
            }

            else if (arr[i] < 0) {
                result_arr[negative_index] = arr[i];
                negative_index += 2;
            }
        }

        return result_arr;
    }

    public static void main(String[] args) {

        int[] nums = { 3, 1, -2, -5, 2, -4 };

        System.out.println("Result array: " + Arrays.toString(rearrangeElements(nums)));
    }
}
