// Rearrange Array Elements by Sign

// There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements. 
// Without altering the relative order of positive and negative elements, you must return an 
// array of alternately positive and negative values.

package Arrays.Medium;

import java.util.Arrays;

public class P8_RearrangeArrayElementsBySignBrute {

    public static int[] rearrangeElements(int[] arr) {

        int[] pos = new int[arr.length / 2];
        int[] neg = new int[arr.length / 2];

        int[] result_arr = new int[arr.length];

        int j = 0, k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                pos[j++] = arr[i];
            } else if (arr[i] < 0) {
                neg[k++] = arr[i];
            }
        }

        for (int i = 0; i < pos.length; i++) {
            result_arr[2 * i] = pos[i];
            result_arr[(2 * i) + 1] = neg[i];
        }

        return result_arr;
    }

    public static void main(String[] args) {

        int[] nums = { 3, 1, -2, -5, 2, -4 };

        System.out.println("Result array: " + Arrays.toString(rearrangeElements(nums)));
    }
}
