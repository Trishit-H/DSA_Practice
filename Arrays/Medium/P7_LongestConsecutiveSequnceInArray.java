// Longest Consecutive Sequence in an Array

// Given an array nums of n integers.
// Return the length of the longest sequence of consecutive integers. 
// The integers in this sequence can appear in any order.

package Arrays.Medium;

import java.util.HashSet;

public class P7_LongestConsecutiveSequnceInArray {

    public static int longestConsecutiveSequence(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // put all numbers in the hashset
        for (int num : nums) {
            set.add(num);
        }

        // keep track of the longest consecutive sequence
        int longest = 0;

        for (int x : set) {

            // start only if x is the beginning
            if (!set.contains(x - 1)) {

                int current = x;
                int count = 1;

                // keep going while the next number exists
                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(count, longest);
            }
        }

        return longest;
    }
}
