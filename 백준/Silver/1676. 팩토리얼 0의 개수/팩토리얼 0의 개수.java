import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        br.close();

        int a = num / 5;
        int b = num / 25;
        int c = num / 125;

        count = a + b + c;

        System.out.println(count);

    }
}