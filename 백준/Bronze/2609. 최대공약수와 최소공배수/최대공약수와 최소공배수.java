import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static int getGCD(int a, int b) {

        while (b != 0) {

            int temp = a % b;
            a = b;
            b = temp;

        }

        return a;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        br.close();

        int gcd = getGCD(a, b);
        int lcm = a * b / gcd;

        System.out.println(gcd);
        System.out.println(lcm);

    }
}