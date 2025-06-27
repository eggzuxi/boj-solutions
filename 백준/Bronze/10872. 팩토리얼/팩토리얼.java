import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public int factorial(int n) throws Exception {

        int result = 1;

        if (n == 0) {
            return 1;
        }

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;

    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = new Main().factorial(n);

        System.out.println(result);
        sc.close();

    }
}