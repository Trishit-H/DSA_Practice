// 1 
// 0 1 
// 1 0 1 
// 0 1 0 1 
// 1 0 1 0 1 

package Star_Patterns;

public class Pattern_11 {

    public static void print(int rows) {
        int n;

        for (int i = 1; i <= rows; i++) {
            n = (i % 2 == 0) ? 0 : 1;

            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
                n = (n + 1) % 2;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
