package Sorting;

public class P2_BubbleSort {

    public static void bubbleSort(int[] arr) {

        // array length
        int n = arr.length;

        // Number of passes
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false;

            // Compare adjacent elements
            for (int j = 0; j < (n - i - 1); j++) {

                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }

            }

            // no swaps mean array is sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = { 5, 3, 8, 1, 2 };

        bubbleSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
