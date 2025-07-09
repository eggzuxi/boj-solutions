import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;

        while (true) {
            input = br.readLine();

            if (input.equals("0")) break;

            StringBuilder sb = new StringBuilder(input);
            String reverse = sb.reverse().toString();

            if (input.equals(reverse)) {
                bw.write("yes\n");
            } else {
                bw.write("no\n");
            }
        }

        bw.flush();
        br.close();

    }
}