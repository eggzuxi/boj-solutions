import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        } else {

            for (int i = 2; i <= (int)Math.pow(n, 0.5) + 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }

            return true;
        }
        
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");
        br.close();

        int n = Integer.parseInt(strings[0]);
        int m = Integer.parseInt(strings[1]);

        for (int i = n; i <= m; i++ ) {

            if (isPrime(i)) {
                System.out.println(i);
            }

        }

    }
}