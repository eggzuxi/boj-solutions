import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();

        if (num == 1) {
            System.out.println(1);
        } else {
            int count = 1;
            int lastNumber = 1;

            while (true) {

                lastNumber = lastNumber + 6 * count;
                count++;

                if (num <= lastNumber) {
                    System.out.println(count);
                    break;
                }

            }

        }

    }
}