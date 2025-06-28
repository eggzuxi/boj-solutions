import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        boolean[] submitted = new boolean[31];

        for (int i = 0; i < 28; i++) {
            int student = sc.nextInt();
            submitted[student] = true;
        }

        for (int i = 1; i <= 30; i++) {

            if (!submitted[i]) {
                System.out.println(i);
            }

        }

        sc.close();



    }
}