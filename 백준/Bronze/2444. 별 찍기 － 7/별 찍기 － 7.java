import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "*";
        String padding = " ";

        for (int i = 1; i <= n; i++) {
            System.out.println(padding.repeat(n - i) + s.repeat(2 * i - 1));
        }

        for (int i = n - 1; i >= 1; i--) {
            System.out.println(padding.repeat(n - i) + s.repeat(2 * i - 1));
        }

        sc.close();

    }
}