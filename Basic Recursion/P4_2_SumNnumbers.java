// Functional

public class P4_2_SumNnumbers {
    public static void main(String[] args) {
        int N = 10;
        int sum = print(N);

        System.out.println(sum);
    }

    public static int print(int N) {
        if (N == 0) {
            return 0;
        }

        return N + print(N - 1);
    }
}
