import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder(input);
        String reverse = sb.reverse().toString();

        if (input.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        br.close();

    }
}