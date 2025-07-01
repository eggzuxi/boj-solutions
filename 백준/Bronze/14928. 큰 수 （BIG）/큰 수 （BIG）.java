import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        long n = 20000303L;
        long reminder = 0;

        for (int i = 0; i < s.length(); i++) {

            int j = s.charAt(i) - '0';
            reminder = (reminder * 10 + j) % n;

        }

        System.out.println(reminder);

        br.close();

    }
}