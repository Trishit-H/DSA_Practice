// Reverse Words in a String

// Given an input string, containing upper-case and lower-case letters, digits, and 
// spaces( ' ' ). A word is defined as a sequence of non-space characters. The words 
// in s are separated by at least one space. Return a string with the words in reverse 
// order, concatenated by a single space.

package Strings.Easy;

public class P1_ReverseWordsInString {

    public static String reverseWords(String str) {

        StringBuilder result = new StringBuilder();

        int i = str.length() - 1;

        while (i >= 0) {

            // skip spaces
            while (i >= 0 && str.charAt(i) == ' ') {
                i--;
            }

            // no more words left in the string
            if (i < 0) {
                break;
            }

            // right boundary of the current word from the end
            int right = i;

            // find the beginning of the word
            while (i >= 0 && str.charAt(i) != ' ') {
                i--;
            }

            // left boundary of the current word
            int left = i + 1;

            // add a space between words
            if (result.length() > 0) {
                result.append(' ');
            }

            // add the current word
            result.append(str.substring(left, right + 1));
        }

        return result.toString();
    }

    // main function
    public static void main(String[] args) {

        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println("String 1: " + s1 + ", Reversed: " + reverseWords(s1));
        System.out.println("String 2: " + s2 + ", Reversed: " + reverseWords(s2));
        System.out.println("String 3: " + s3 + ", Reversed: " + reverseWords(s3));
    }
}
