//   *   
//   ***  
//  ***** 
// *******
// *******
//  ***** 
//   ***  
//    *  

public class Pattern_9 {

    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }

            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        System.out.println();
    }

    public static void main(String[] args) {
        print(3);
        print(5);
    }
}