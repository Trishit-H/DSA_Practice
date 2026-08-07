package Arrays.Easy;

import java.util.Arrays;

public class P1_LargestElement {

    public static int solution(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 1, 3, 0 };
        int max = solution(arr1);
        System.out.println("The largest element in " + Arrays.toString(arr1) + " is " + max);

        int[] arr2 = { 8, 10, 5, 7, 9 };
        max = solution(arr2);
        System.out.println("The largest element in " + Arrays.toString(arr2) + " is " + max);

    }
}
