import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine().trim();

        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }

        String[] arr = s.split("\\s+");

        int result = arr.length;

        System.out.println(result);

        br.close();

    }
}