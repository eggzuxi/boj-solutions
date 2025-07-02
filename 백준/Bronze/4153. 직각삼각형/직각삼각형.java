import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        while (true) {

            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            long[] sides = {a, b, c};
            Arrays.sort(sides);

            if (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2] ) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        }

        sc.close();

    }
}