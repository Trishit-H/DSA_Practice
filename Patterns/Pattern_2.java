
public class Pattern_2 {

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= (i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        print(3);
        print(4);
        print(5);
    }
}
