import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public void babo() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] arr = s.trim().split("\\s+");

        long a = Long.parseLong(arr[0]);
        long b = Long.parseLong(arr[1]);
        long c = Long.parseLong(arr[2]);

        long sum = a + b + c;

        System.out.println(sum);


    }

    public static void main(String[] args) throws Exception {

        new Main().babo();

    }
}