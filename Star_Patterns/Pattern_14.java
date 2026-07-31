package Star_Patterns;

public class Pattern_14 {

    public static void print(int n) {
        for (int i = 1; i <= n; i++) {
            char ch = 'A';

            for (int j = 1; j <= i; j++) {
                System.out.print((char) ch + " ");
                ch = (char) (ch + 1);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
