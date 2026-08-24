// Find the Majority Element that occurs more than N/2 times

// Problem Statement: Given an integer array nums of size n, return the majority element of the array.
// The majority element of an array is an element that appears more than n/2 times in the array. 
// The array is guaranteed to have a majority element.

package Arrays.Medium;

import java.util.HashMap;

public class P3_MajorityElement1Better {

    // Function to find the majority element that occurs
    // more than N/2 times in the array
    public static int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each element
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the element whose frequency is greater than N/2
        for (int num : nums) {
            if (map.get(num) > nums.length / 2) {
                return num;
            }
        }

        return -1;
    }

    // main function
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println("Majority element: " + majorityElement(nums));
    }
}
