import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int[] tokens = new int[input.length];

        for (int i = 0; i < tokens.length; i++) {
            tokens[i] = Integer.parseInt(input[i]);
        }

        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < tokens.length - 1; i++) {

            if (tokens[i] + 1 != tokens[i + 1]) {
                isAscending = false;
            }

            if (tokens[i] - 1 != tokens[i + 1]) {
                isDescending = false;
            }

        }

        if (isAscending) {
            System.out.println("ascending");
        } else if (isDescending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }

        br.close();

    }
}