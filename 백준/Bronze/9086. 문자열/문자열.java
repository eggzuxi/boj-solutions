import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int n = Integer.parseInt(s);

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {

            if (arr[i] != null) {
                char first = arr[i].charAt(0);
                char last = arr[i].charAt(arr[i].length() - 1);
                System.out.println(String.valueOf(first) + String.valueOf(last));
            }

        }

        br.close();

    }
}