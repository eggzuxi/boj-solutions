import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public void compare() throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] arr = s.trim().split(" ");

        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }

    public static void main(String[] args) throws Exception {

        new Main().compare();

    }
}