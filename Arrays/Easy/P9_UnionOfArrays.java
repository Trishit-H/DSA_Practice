// Union of Two Sorted Arrays

// Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
// The union of two arrays can be defined as the common and distinct elements in the two arrays.
// NOTE: Elements in the union should be in ascending order.

package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

public class P9_UnionOfArrays {

    // function to return the union of two arrays
    public static List<Integer> findUnion(int[] arr1, int[] arr2) {

        // stores the distinct elements of both the arrays
        List<Integer> union = new ArrayList<>();

        // pointers for both sorted arrays
        int pointer1 = 0;
        int pointer2 = 0;

        // process both arrays while elements remain in both
        while (pointer1 < arr1.length && pointer2 < arr2.length) {

            int value;

            // arr1 has the current smaller element
            if (arr1[pointer1] < arr2[pointer2]) {
                value = arr1[pointer1];
                pointer1++;
            }

            // arr2 has the current smaller element
            else if (arr1[pointer1] > arr2[pointer2]) {
                value = arr2[pointer2];
                pointer2++;
            }

            // both have the same value -> add it once
            else {
                value = arr1[pointer1];
                pointer1++;
                pointer2++;
            }

            // add only if this value isn't already
            // the last value in union
            if (union.isEmpty() || union.get(union.size() - 1) != value) {
                union.add(value);
            }
        }

        // process remaining elements of arr1
        while (pointer1 < arr1.length) {

            if (union.isEmpty() || union.get(union.size() - 1) != arr1[pointer1]) {
                union.add(arr1[pointer1]);
            }

            pointer1++;
        }

        // process remaining elements of arr2
        while (pointer2 < arr2.length) {

            if (union.isEmpty() || union.get(union.size() - 1) != arr2[pointer1]) {
                union.add(arr2[pointer2]);
            }

            pointer2++;
        }

        // return the union array
        return union;
    }

    // main function
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 4, 7, 8 };
        int[] arr2 = { 2, 2, 3, 4, 6, 7 };

        List<Integer> result = findUnion(arr1, arr2);

        System.out.println(result);
    }
}
