import java.util.*;
import java.lang.*;

public class Main {

    public void Solution() throws Exception {

        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true) {
            a = sc.nextInt();
            if (a >= 1 && a <= 10000) {
                break;
            } else {
                continue;
            }
        }

        while (true) {
            b = sc.nextInt();
            if (b >= 1 && b <= 10000) {
                break;
            } else {
                continue;
            }
        }

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    }

    public static void main(String[] args) throws Exception {

        new Main().Solution();

    }
}