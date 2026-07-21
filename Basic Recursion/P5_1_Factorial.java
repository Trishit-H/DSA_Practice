// Parameterized

public class P5_1_Factorial {
    public static void main(String[] args) {
        int N = 5;
        printFactorial(N, 1);
    }

    public static void printFactorial(int i, int product) {
        if (i < 1) {
            System.out.println(product);
            return;
        }

        printFactorial(i - 1, product * i);
    }
}
