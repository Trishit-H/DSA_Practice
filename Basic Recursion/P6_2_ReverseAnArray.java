// Using single pointer

import java.util.Arrays;

public class P6_2_ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr, 0);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int i) {
        if (i >= arr.length / 2) {
            return;
        }

        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;

        reverse(arr, i + 1);
    }
}
