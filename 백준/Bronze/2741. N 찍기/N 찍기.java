import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public int[] solve(int n) throws Exception {

        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        return arr;

    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] result = new Main().solve(n);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\n");
        }

        sc.close();

    }
}