// Largest Odd Number in a String

// Given a string s, representing a large integer, the task is to return the largest-valued odd 
// integer (as a string) that is a substring of the given string s.
// The number returned should not have leading zero's. But the given input string may have leading zero.

package Strings.Easy;

public class P2_LargestoddNumberInString {

    public static String largestOddNumber(String str) {

        int right = str.length() - 1;

        // find the rightmost odd digit
        while (right >= 0) {

            int digit = str.charAt(right) - '0';

            // stop when an odd digit is found
            if (digit % 2 != 0) {
                break;
            }

            right--;
        }

        // no odd digit found
        if (right < 0) {
            return "";
        }

        int left = 0;

        // skip leading zeroes
        while (left <= right && str.charAt(left) == '0') {
            left++;
        }

        // return the substring from first non-zero to rightmost odd right
        return str.substring(left, right + 1);
    }

    // main function
    public static void main(String[] args) {

        String num1 = "52";
        String num2 = "4206";
        String num3 = "35427";

        System.out.println("String 1: " + num1 + ", Longest odd number: " + largestOddNumber(num1));
        System.out.println("String 2: " + num2 + ", Longest odd number: " + largestOddNumber(num2));
        System.out.println("String 3: " + num3 + ", Longest odd number: " + largestOddNumber(num3));
    }
}
