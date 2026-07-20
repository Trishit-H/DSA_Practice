class Solution {
    public void printName(String name, int count, int N) {
        if (count == N) {
            return;
        }

        System.out.println(name);
        printName(name, count + 1, N);
    }
}

public class P1_PrintNameNTimes {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int N = 5;
        String name = "John Doe";

        sol.printName(name, 0, N);
    }
}
