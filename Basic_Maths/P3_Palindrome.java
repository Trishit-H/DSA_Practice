package Basic_Maths;

public class P3_Palindrome {

    public static boolean isPalindrome(int num) {
        int reversed = 0;
        int copy = num;

        if (num < 0) {
            return false;
        }

        if (num < 10) {
            return true;
        }

        while (copy != 0) {
            int lastDigit = copy % 10;
            reversed = (reversed * 10) + lastDigit;
            copy = copy / 10;
        }

        return (num == reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
