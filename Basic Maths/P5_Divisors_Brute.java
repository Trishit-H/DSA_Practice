import java.util.*;

public class P5_Divisors_Brute {

    public static List<Integer> getDivisors(int N) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(getDivisors(36));
        System.out.println(getDivisors(12));
    }
}
