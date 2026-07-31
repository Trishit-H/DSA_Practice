package Basic_Maths;

public class P2_ReverseNumber {

    public static int reverse(int n) {
        long reversed = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            reversed = (reversed * 10) + lastDigit;
            n = n / 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversed;
    }

    public static void main(String[] args) {
        System.out.println(reverse(7789));
        System.out.println(reverse(-9891));
    }
}
