// Leaders in an Array

package Arrays.Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P6_LeadersInArray {

    // function to find the leaders in an array
    public static List<Integer> leadersArr(int[] arr) {

        // array list to store the leaders
        List<Integer> leaders = new ArrayList<>();

        int n = arr.length;
        int max = arr[n - 1];

        // rightmost element is always the leader
        leaders.add(max);

        // traverse the array
        for (int i = n - 2; i >= 0; i--) {

            // if current element is greater than max,
            // then it is a leader
            if (arr[i] > max) {
                leaders.add(arr[i]);
                max = arr[i];
            }
        }

        // we found the leaders from right to left, so reverse them
        Collections.reverse(leaders);

        // return the leaders list
        return leaders;
    }

    // main function
    public static void main(String[] args) {

        int[] arr = { 4, 7, 1, 0 };

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("leaders: " + leadersArr(arr));
    }
}
