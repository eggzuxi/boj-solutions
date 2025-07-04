import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] bucket = new int[n];

        for (int i = 0; i < n; i++) {
            bucket[i] = i + 1;
        }

        for (int i = 0; i < m; i++) {

            String[] arr = br.readLine().split(" ");
            int start = Integer.parseInt(arr[0]) - 1;
            int end = Integer.parseInt(arr[1]) - 1;
            int temp = 0;

            while (start < end) {
                temp = bucket[start]; bucket[start] = bucket[end]; bucket[end] = temp;
                start++;
                end--;
            }

        }

        Arrays.stream(bucket).forEach(x -> System.out.print(x + " "));
        br.close();

    }
}