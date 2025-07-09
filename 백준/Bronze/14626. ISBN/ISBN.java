import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        char[] chars = input.toCharArray();
        int[] isbn = new int[13];
        int idx = 0;

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == '*') {
                isbn[i] = 0;
                idx = i;
            } else {
                isbn[i] = chars[i] - '0';
            }

        }

        int sum = 0;
        int result = 0;

        for (int i = 0; i < isbn.length; i++) {

            if (i % 2 == 0) {
                sum += isbn[i];
            } else {
                sum += 3 * isbn[i];
            }

        }

        int weight = idx % 2 == 0 ? 1 : 3;

        for (int i = 0; i <= 9; i++) {

            if ((sum + weight * i) % 10 == 0) {
                result = i;
            }

        }

        System.out.println(result);

    }
}