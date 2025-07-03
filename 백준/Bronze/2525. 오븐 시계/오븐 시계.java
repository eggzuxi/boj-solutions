import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int plus = sc.nextInt();

        if (m + plus < 60) {
            m += plus;
            System.out.printf(h + " " + m);
        } else {

            h += (m + plus) / 60;
            m = 0 + (m + plus) % 60;

            if (h > 23) {
                h = h % 24;
            }

            System.out.print(h + " " + m);

        }

        sc.close();

    }
}