// Parametrized 

package Basic_Recursion;

public class P4_1_SumNnumbers {
    public static void main(String[] args) {
        int N = 10;
        print(N, 0);
    }

    public static void print(int i, int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        }

        print(i - 1, sum + i);
    }
}
