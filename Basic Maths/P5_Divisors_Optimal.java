import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P5_Divisors_Optimal {

    public static List<Integer> getDivisors(int N) {
        List<Integer> res = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                res.add(i);

                if (i != (N / i)) {
                    res.add(N / i);
                }
            }
        }

        Collections.sort(res);

        return res;
    }

    public static void main(String[] args) {
        System.out.println(getDivisors(36));
        System.out.println(getDivisors(12));
    }
}
