import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static int compare(int a, int b) throws Exception {

        if (a == b) {
            return 0;
        } else if (a > b) {
            return -(Math.abs(a - b));
        } else {
            return Math.abs(a - b);
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];
        String[] s = br.readLine().split(" ");
        int[] result = new int[6];

        for (int i = 0; i < 6; i++) {
            input[i] = Integer.parseInt(s[i]);
        }

        for (int i = 0; i < 6; i++) {

            int a = input[i];
            int b = chess[i];

            result[i] = compare(a, b);

        }

        Arrays.stream(result).forEach(x -> System.out.print(x + " "));
        br.close();

    }
}