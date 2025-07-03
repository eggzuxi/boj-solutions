import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int kind = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < kind; i++) {

            String s = br.readLine();
            String[] ss = s.split(" ");
            int price = Integer.parseInt(ss[0]) * Integer.parseInt(ss[1]);
            sum += price;

        }

        if (sum == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        br.close();

    }
}