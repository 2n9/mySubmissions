// import java util
import java.math.BigDecimal;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();
        int x = Math.min(A, B);
        if (x == A && x == B) {
            System.out.println(x);
            return;
        }
        while (true) {
            if (isSuperLuckyNumber(x, A, B)) {
                System.out.println(x);
                break;
            }
            x++;
        }
    }

    private static boolean isSuperLuckyNumber(int x, int a, int b) {
        String xStr = String.valueOf(x);
        String x2Str = String.valueOf(x * 2);
        if (xStr.contains(String.valueOf(a))) {
            if (x2Str.contains(String.valueOf(b))) {
                return true;
            }
        }
        return false;
    }
}
