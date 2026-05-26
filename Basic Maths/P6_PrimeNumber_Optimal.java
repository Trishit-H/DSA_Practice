public class P6_PrimeNumber_Optimal {

    public static boolean isPrime(int N) {
        int count = 0;
        int sqrtN = (int) Math.sqrt(N);

        for (int i = 1; i <= sqrtN; i++) {
            if (N % i == 0) {
                count++;

                if (i != N / i) {
                    count++;
                }
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
