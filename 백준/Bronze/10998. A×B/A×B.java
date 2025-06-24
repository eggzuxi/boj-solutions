import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public void Solution() throws Exception {

        Scanner sc = new Scanner(System.in);
        int a, b;

        while (true) {
            a = sc.nextInt();
            if (a > 0 && a < 10) {
                break;
            } else {
                System.out.print("Enter an integer : ");
            }
        }

        while (true) {
            b = sc.nextInt();
            if (b > 0 && b < 10) {
                break;
            } else {
                System.out.print("Enter an integer : ");
            }
        }

        System.out.println(a * b);

    }

    public static void main(String[] args) throws Exception {

        new Main().Solution();

    }
}