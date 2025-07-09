import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    static long hash(long[] arr) throws Exception {

        long r = 31;
        long m = 1234567891;
        long pow = 1;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum = (sum + (arr[i] * pow) % m) % m;
            pow = (r * pow) % m;

        }

        return sum;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long num = 0;
        int l = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split("");
        long[] arr = new long[l];
        long output = 0;

        for (int i = 0; i < l; i++) {

            num = (input[i].charAt(0) - 'a') + 1;
            arr[i] = num;

        }

        output = hash(arr);
        System.out.println(output);

        br.close();

    }
}