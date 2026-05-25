public class Pattern_22 {

    public static void print(int n) {
        for (int i = 0; i < (2 * n - 1); i++) {
            for (int j = 0; j < (2 * n - 1); j++) {
                int top = i;
                int left = j;
                int bottom = (2 * n - 2) - i;
                int right = (2 * n - 2) - j;

                int element = n - Math.min(Math.min(top, bottom), Math.min(left, right));
                System.out.print(element + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
