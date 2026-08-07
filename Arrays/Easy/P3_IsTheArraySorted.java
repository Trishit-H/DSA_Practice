package Arrays.Easy;

import java.util.Arrays;

public class P3_IsTheArraySorted {

    public static boolean isSorted(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(arr1) + ": " + isSorted(arr1));

        int[] arr2 = { 5, 4, 6, 7, 8 };
        System.out.println(Arrays.toString(arr2) + ": " + isSorted(arr2));
    }
}
