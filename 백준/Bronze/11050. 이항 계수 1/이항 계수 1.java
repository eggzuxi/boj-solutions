import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int f1 = 1; int f2 = 1; int f3 = 1;

        for (int i = 2; i <= n; i++) {
            f1 *= i;
        }

        for (int i = 2; i <= k; i++) {
            f2 *= i;
        }

        for (int i = 2; i <= n - k; i++) {
            f3 *= i;
        }

        int result = f1 / (f2 * f3);

        System.out.println(result);

    }
}