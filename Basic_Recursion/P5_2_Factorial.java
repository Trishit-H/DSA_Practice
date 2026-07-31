// Functional

package Basic_Recursion;

public class P5_2_Factorial {
    public static void main(String[] args) {
        int N = 5;
        System.out.println(getFactorial(N));
    }

    public static int getFactorial(int N) {
        if (N == 1) {
            return 1;
        }

        return N * getFactorial(N - 1);
    }
}
