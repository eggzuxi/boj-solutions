import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {

            n = Integer.parseInt(br.readLine());
            arr[i] = n % 42;

        }

        Arrays.sort(arr);

        Set<Integer> unique = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            unique.add(arr[i]);
        }

        int result = unique.size();
        System.out.println(result);

        br.close();

    }
}