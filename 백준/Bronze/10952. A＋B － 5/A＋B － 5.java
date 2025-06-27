import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a == 0 && b == 0) {
                break;
            }

            int sum = a + b;
            System.out.println(sum);

        }

    }
}