// Find the Majority Element that occurs more than N/2 times

// Problem Statement: Given an integer array nums of size n, return the majority element of the array.
// The majority element of an array is an element that appears more than n/2 times in the array. 
// The array is guaranteed to have a majority element.

package Arrays.Medium;

public class P3_MajorityElement1Optimized {

    // function to find the majority element that occurs in the
    // array more than N/2
    public static int majorityElement(int[] nums) {

        // candidate stores the current element that
        // is considered as the majority element
        int candidate = 0;

        // count represents the balance of the candidate
        // after cancelling it with different elements
        int count = 0;

        // traverse the array
        for (int num : nums) {

            // if count becomes 0, the current candidate
            // has been completely cancelled out.
            // so the current element becomes the new candidate
            if (count == 0) {
                candidate = num;
                count++;
            }

            // if the current element is same as the candidate,
            // it supports the candidate, so increase the count
            else if (candidate == num) {
                count++;
            }

            // // If the current element is different from the candidate,
            // it cancels one occurrence of the candidate,
            // so decrease the count.
            else if (candidate != num) {
                count--;
            }
        }

        // return the final candidate which is the
        // majority element
        return candidate;
    }

    // main function
    public static void main(String[] args) {
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        System.out.println("Majority element: " + majorityElement(nums));
    }
}
