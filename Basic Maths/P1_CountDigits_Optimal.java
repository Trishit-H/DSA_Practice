public class P1_CountDigits_Optimal {

    public static int count(int n) {
        int count = (int) Math.log10(n) + 1;

        return count;
    }

    public static void main(String[] args) {
        System.out.println(count(7789));
        System.out.println(count(100));
    }
}
