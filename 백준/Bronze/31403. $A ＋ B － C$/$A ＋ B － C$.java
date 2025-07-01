import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int numResult = a + b - c;

        int stringResult = Integer.parseInt(String.valueOf(a) + String.valueOf(b)) - c;

        System.out.println(numResult);
        System.out.println(stringResult);

        br.close();

    }
}