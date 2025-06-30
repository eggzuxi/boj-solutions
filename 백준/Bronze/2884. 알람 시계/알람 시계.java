import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int n;

        if ( m - 45 > 0 ) {

            n = m - 45;
            System.out.println(h + " " + n);

        } else if ( m - 45 == 0 ) {

            m = 0;
            System.out.println(h + " " + m);

        } else {

            n = 60 - Math.abs(m - 45);
            h = h - 1;

            // bad code
            if (h < 0) {
                h = 24 - 1;
            }

            System.out.println(h + " " + n);

        }

        sc.close();

    }
}