import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int thYear = Integer.parseInt(br.readLine());

        int korYear = thYear - 543;

        System.out.println(korYear);
        br.close();

    }
}