public class P7_Palindrome {
    public static void main(String[] args) {
        String str1 = "MADAM";
        String str2 = "okay";

        System.out.println(isPalindrome(0, str1));
        System.out.println(isPalindrome(0, str2));
    }

    static boolean isPalindrome(int i, String str) {
        if (i >= str.length() / 2) {
            return true;
        }

        if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
            return false;
        }

        return isPalindrome(i + 1, str);
    }
}
