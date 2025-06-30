import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public long atSign(long a, long b) throws Exception {

        return (a + b) * (a - b);

    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long result = new Main().atSign(a, b);

        sc.close();

        System.out.println(result);

    }
}