import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];

        for (int i = 0; i < t; i++) {

            arr[i] = Integer.parseInt(br.readLine());

        }

        Arrays.sort(arr);

        for (int i = 0; i < t; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        br.close();

    }
}