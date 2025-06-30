import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public int atSign(int a, int b) throws Exception {

        return (a + b) * (a - b);

    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = new Main().atSign(a, b);

        sc.close();

        System.out.println(result);

    }
}