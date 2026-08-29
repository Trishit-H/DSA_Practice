// Longest Common Prefix

// Problem Statement: Write a function to find the longest common prefix string amongst an 
// array of strings. If there is no common prefix, return an empty string "".

package Strings.Easy;

public class P3_LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        // intially assume the first string is the common prefix
        String prefix = strs[0];

        // compare prefix with every remaining string
        for (int j = 1; j < strs.length; j++) {

            String word = strs[0];

            // start comparing from index 0
            int i = 0;

            // we can only come up to the length of the shorter string
            int minLength = Math.min(word.length(), prefix.length());

            // move forward while the characters are matching
            while (i < minLength && word.charAt(i) == prefix.charAt(i)) {
                i++;
            }

            // keep only the part that matched
            prefix = prefix.substring(0, i);

            // no common prefix remains
            if (prefix.isEmpty()) {
                return "";
            }
        }

        // return the longest common prefix
        return prefix;
    }
}
