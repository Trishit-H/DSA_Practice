// Remove Duplicates in-place from Sorted Array

// Given an integer array sorted in non-decreasing order, remove the duplicates in place such 
// that each unique element appears only once. The relative order of the elements should be kept 
// the same. If there are k elements after removing the duplicates, then the first k elements of the 
// array should hold the final result. It doesn't matter what you leave beyond the first k elements.

package Arrays.Easy;

public class P4_RemoveDuplicates {

    // functiont to remove duplicate elements in-place and return the length of
    // unique array
    public static int removeDuplicateElements(int[] arr) {

        // array length
        int arrLength = arr.length;

        // Edge case: If less than 2 elements then return the length.
        if (arrLength < 2) {
            return arrLength;
        }

        // Two pointer method
        int pointer1 = 0;
        int pointer2 = 1;

        // traverse the array
        while (pointer2 <= arrLength - 1) {

            // duplicate
            if (arr[pointer1] == arr[pointer2]) {
                pointer2++;
            }

            // new unique element
            else if (arr[pointer1] != arr[pointer2]) {
                arr[pointer1 + 1] = arr[pointer2];
                pointer1++;
                pointer2++;
            }
        }

        // number of unique elements
        return pointer1 + 1;
    }

    // main function
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 2, 3, 3, 4 };

        int uniqueCount = removeDuplicateElements(arr);

        System.out.print("Number of unique elements: " + uniqueCount + "\n");

        System.out.println("Array after removing duplicates: ");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
