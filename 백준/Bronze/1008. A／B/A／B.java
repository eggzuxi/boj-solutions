import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public void Solution() throws Exception {

        Scanner sc = new Scanner(System.in);
        double a, b;

        while (true) {
            a = sc.nextDouble();
            if (a > 0 && a < 10) {
                break;
            } else {
                continue;
            }
        }

        while (true) {
            b = sc.nextDouble();
            if (b > 0 && b < 10) {
                break;
            } else {
                continue;
            }
        }

        System.out.println(a / b);

    }

    public static void main(String[] args) throws Exception {

        new Main().Solution();

    }
}