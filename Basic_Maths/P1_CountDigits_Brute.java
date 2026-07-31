package Basic_Maths;

public class P1_CountDigits_Brute {

    public static int count(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n = n / 10;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(7789));
        System.out.println(count(1000));
    }
}
