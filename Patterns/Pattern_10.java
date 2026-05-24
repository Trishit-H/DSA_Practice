// * 
// * * 
// * * * 
// * * * * 
// * * * * * 
// * * * * 
// * * * 
// * * 
// * 

public class Pattern_10 {

    public static void print(int n) {
        for (int i = 1; i <= (2 * n - 1); i++) {
            int col = i;

            if (i > n) {
                col = 2 * n - i;
            }

            for (int j = 1; j <= col; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        print(5);
    }
}
