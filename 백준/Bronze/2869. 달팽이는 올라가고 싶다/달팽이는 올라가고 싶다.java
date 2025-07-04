import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int v = Integer.parseInt(input[2]);
        br.close();

        int day;
        int snail = a - b;
        int lastHeight = v - a;

        if (lastHeight <= 0) {

            day = 1;

        } else {

            day = lastHeight / snail;
            if (lastHeight % snail != 0) {
                day++;
            }
            day++;

        }

        System.out.println(day);

    }
}