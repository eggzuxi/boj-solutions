import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] k = new int[t];
        int[] n = new int[t];

        for (int i = 0; i < t; i++) {

            k[i] = Integer.parseInt(br.readLine());
            n[i] = Integer.parseInt(br.readLine());

        }

        br.close();

        int[][] apt = new int[15][15];

        for (int i = 1; i <= 14; i++) {
            apt[0][i] = i;
        }

        for (int i = 0; i <= 14; i++) {
            apt[i][1] = 1;
        }

        for (int i = 1; i <= 14; i++) {

            for (int j = 2; j <= 14; j++) {

                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];

            }

        }

        for (int i = 0; i < t; i++) {

            System.out.println(apt[k[i]][n[i]]);

        }

    }
}