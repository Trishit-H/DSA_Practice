package Star_Patterns;

public class Pattern_16 {

    public static void print(int n) {
        for (char ch = 'A'; ch < 'A' + n; ch++) {
            for (int i = 1; i <= (ch - 'A' + 1); i++) {
                System.out.print(ch + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
