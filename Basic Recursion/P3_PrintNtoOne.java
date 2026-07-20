public class P3_PrintNtoOne {
    public static void main(String[] args) {
        int N = 4;
        print(N, N);
    }

    public static void print(int i, int N) {
        if (i < 1) {
            return;
        }

        System.out.print(i + " ");
        print(i - 1, N);
    }
}
