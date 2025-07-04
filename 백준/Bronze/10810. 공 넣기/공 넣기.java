import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int[] bucket = new int[n];
        Arrays.fill(bucket, 0);

        for (int i = 0; i < m; i++) {

            String[] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            int ball = Integer.parseInt(arr[2]);

            Arrays.fill(bucket, a - 1, b, ball);

        }

        Arrays.stream(bucket).forEach(x -> System.out.print(x + " "));
        br.close();

    }
}