import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    // bad code
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            StringBuilder sb = new StringBuilder();

            int r = sc.nextInt();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {

                char c = s.charAt(j);

                for (int k = 0; k < r; k++) {
                    sb.append(c);
                }

            }

            String result = sb.toString();
            System.out.println(result);

        }

        sc.close();

    }
}