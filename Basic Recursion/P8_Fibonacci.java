public class P8_Fibonacci {
    public static void main(String[] args) {
        int N = 7;
        System.out.println(fibonacciNum(N));
    }

    static int fibonacciNum(int N) {
        if (N <= 1) {
            return N;
        }

        int last = fibonacciNum(N - 1);
        int secondLast = fibonacciNum(N - 2);
        return last + secondLast;
    }
}
