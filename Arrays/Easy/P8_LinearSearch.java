package Arrays.Easy;

public class P8_LinearSearch {

    // function to find the index of a given element in an array
    public static int linearSearch(int[] arr, int num) {

        // array length
        int arrLength = arr.length;

        // search the array elements one by one
        for (int i = 0; i < arrLength; i++) {

            // if found, return index
            if (arr[i] == num) {
                return i;
            }
        }

        // if not found, return -1
        return -1;
    }

    // main function
    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 4, 5 };
        int num = 4;
        System.out.println(linearSearch(arr1, num));
    }
}
