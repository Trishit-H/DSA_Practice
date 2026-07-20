class Solution_2 {
    public void print(int i, int N) {
        if (i > N) {
            return;
        }

        System.out.print(i + " ");
        print(i + 1, N);
    }
}

public class P2_PrintOnetoN {
    public static void main(String[] args) {
        Solution_2 sol = new Solution_2();
        int N = 10;

        sol.print(1, N);
    }
}
