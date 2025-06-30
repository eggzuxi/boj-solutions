import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public int multiple(int a, int b, int c) {

        return a * b * c;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int result = new Main().multiple(a, b, c);
        String s = String.valueOf(result);

        int[] arr = new int[10];
        Arrays.fill(arr, 0);

        for (int i = 0; i < s.length(); i++) {

            int idx = (int)s.charAt(i) - '0';
            arr[idx]++;

        }

        Arrays.stream(arr).forEach(System.out::println);
        br.close();

    }
}