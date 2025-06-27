import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public long gap(long n, long m) throws Exception {

        long result = Math.abs(n - m);
        return result;

    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long m = sc.nextInt();

        sc.close();

        long result = new Main().gap(n, m);
        System.out.println(result);

    }
}