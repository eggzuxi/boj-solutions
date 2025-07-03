import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int output = -1;

        for (int i = n / 5; i >= 0; i--) {

            int remain = n - i * 5;

            if (remain % 3 == 0) {
                output = i + remain / 3;
                break;
            }

        }

        System.out.println(output);

        br.close();

    }
}