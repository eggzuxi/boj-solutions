import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static int count_w(int a, int b, char[][] chess) {

        int count = 0;

        for (int i = a; i < a+8; i++) {
            for (int j = b; j < b+8; j++) {
                switch ((i + j) % 2) {
                    case 0:
                        if (chess[i][j] != 'W') {
                            count++;
                        }
                        break;
                    case 1:
                        if (chess[i][j] != 'B') {
                            count++;
                        }
                        break;
                }
            }
        }

        return count;

    }

    public static int count_b(int a, int b, char[][] chess) {

        int count = 0;

        for (int i = a; i < a+8; i++) {
            for (int j = b; j < b+8; j++) {
                switch ((i + j) % 2) {
                    case 0:
                        if (chess[i][j] != 'B') {
                            count++;
                        }
                        break;
                    case 1:
                        if (chess[i][j] != 'W') {
                            count++;
                        }
                        break;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        char[][] chess = new char[n][m];

        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            for (int j = 0; j < m; j++) {
                chess[i][j] = line.charAt(j);
            }
        }

        br.close();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= n-8; i++) {
            for (int j = 0; j <= m-8; j++) {

                int count_w = count_w(i, j, chess);
                int count_b = count_b(i, j, chess);

                int count = Math.min(count_w, count_b);
                if (count < min) {
                    min = count;
                }

            }
        }

        System.out.println(min);

    }
}