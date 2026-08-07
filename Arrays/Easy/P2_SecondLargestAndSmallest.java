package Arrays.Easy;

import java.util.Arrays;

public class P2_SecondLargestAndSmallest {

    // Method to return the second largest element
    public static int secondLargestElement(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            return -1;
        }

        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }

    // Method to return the second smallest element
    public static int secondSmallestElement(int[] arr) {
        int n = arr.length;

        if (n < 2) {
            return -1;
        }

        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        return secondSmallest == Integer.MAX_VALUE ? -1 : secondSmallest;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 4, 7, 7, 5 };
        int secondLargest = secondLargestElement(arr);
        int secondSmallest = secondSmallestElement(arr);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Second largest: " + secondLargest);
        System.out.println("Second smallest: " + secondSmallest);
    }
}
