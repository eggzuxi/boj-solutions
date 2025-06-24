import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public void Solution() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a, b, c;

        StringTokenizer st = new StringTokenizer(br.readLine());

        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        bw.write(((a + b) % c) + "\n");
        bw.write((((a % c) + (b % c)) % c) + "\n");
        bw.write(((a * b) % c) + "\n");
        bw.write((((a % c) * (b % c)) % c) + "\n");

        br.close();
        bw.close();

    }

    public static void main(String[] args) throws Exception {

        new Main().Solution();

    }
}