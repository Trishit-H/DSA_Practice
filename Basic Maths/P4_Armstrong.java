public class P4_Armstrong {

    public static boolean isArmstrong(int num) {
        if (num < 0) {
            return false;
        }

        int sum = 0;
        int copy = num;

        int digits = (int) Math.log10(num) + 1;

        while (copy != 0) {
            int lastDigit = copy % 10;
            sum = sum + (int) Math.pow(lastDigit, digits);
            copy = copy / 10;
        }

        return (sum == num);
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(7));
        System.out.println(isArmstrong(-371));
        System.out.println(isArmstrong(371));
        System.out.println(isArmstrong(1634));
    }
}
