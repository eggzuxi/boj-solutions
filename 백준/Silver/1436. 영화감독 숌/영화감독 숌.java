import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int num = 666;
        int result = num;
        br.close();

        while (n != 1) {

            num += 1;
            if (String.valueOf(num).contains("666")) {
                result = num;
                n -= 1;
            }

        }

        System.out.println(result);

    }
}