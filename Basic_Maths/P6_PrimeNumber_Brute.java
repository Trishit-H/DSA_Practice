package Basic_Maths;

public class P6_PrimeNumber_Brute {

    public static boolean isPrime(int N) {
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;
            }
        }

        return count == 2;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(12));
        System.out.println(isPrime(19));
        System.out.println(isPrime(21));
    }
}
