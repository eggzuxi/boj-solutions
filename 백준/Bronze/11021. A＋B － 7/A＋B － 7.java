import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++){

            String[] s = br.readLine().split(" ");
            int sum = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
            System.out.println("Case #" + (i + 1) + ": " + sum);

        }

        br.close();

    }
}