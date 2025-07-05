import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static int getDigitSum(int n) {

        int sum = 0;

        while (n != 0) {

            sum += n % 10;
            n /= 10;

        }

        return sum;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int result = 0;

        for (int i = 1; i < n; i++) {

            int sum = i + getDigitSum(i);

            if (sum == n) {
                result = i;
                break;
            }

        }

        System.out.println(result);

    }
}