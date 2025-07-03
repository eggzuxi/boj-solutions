import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static int isMatch(int[] arr) throws Exception {

        int result = 0;

        if (arr[0] == arr[1]) {
            result = arr[0];
        } else if (arr[1] == arr[2]) {
            result = arr[1];
        } else if (arr[0] == arr[2]) {
            result = arr[2];
        }

        return result;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int[] arr = new int[input.length];
        int money = 0;

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        if (Arrays.stream(arr).distinct().count() == 1) {
            money = 10000 + arr[0] * 1000;
        } else if (Arrays.stream(arr).distinct().count() == 2) {
            money = 1000 + isMatch(arr) * 100;
        } else {
            int max = Arrays.stream(arr).max().getAsInt();
            money = max * 100;
        }

        System.out.println(money);
        br.close();

    }
}