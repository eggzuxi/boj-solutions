import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public int solution() throws Exception {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int quadrant = 0;

        if (x > 0) {

            if (y > 0) {
                quadrant = 1;
            } else if (y < 0) {
                quadrant = 4;
            }

        } else if (x < 0) {

            if (y > 0) {
                quadrant = 2;
            } else if (y < 0) {
                quadrant = 3;
            }

        }

        sc.close();

        return quadrant;
    }

    public static void main(String[] args) throws Exception {

        int result = new Main().solution();
        System.out.println(result);

    }
}