public class P7_GCD_Brute {

    public static int findGcd(int N1, int N2) {
        int gcd = 1;

        int min = Math.min(N1, N2);
        for (int i = 1; i <= min; i++) {
            if (N1 % i == 0 && N2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(findGcd(12, 9));
        System.out.println(findGcd(11, 19));
    }
}
