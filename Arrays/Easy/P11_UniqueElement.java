// Find the number that appears once, and the other numbers twice

// Given a non-empty array of integers arr, every element appears twice 
// except for one. Find that single one.

package Arrays.Easy;

public class P11_UniqueElement {

    // method to return the element that appears only once in the array
    public static int appearsOnlyOnce(int[] arr) {

        // variable to store the xor of all elements
        int result = 0;

        for (int num : arr) {
            result = result ^ num;
        }

        return result;
    }

    // main method
    public static void main(String[] args) {
        int[] arr = { 4, 1, 2, 1, 2 };

        System.out.println("Unique element: " + appearsOnlyOnce(arr));
    }
}
