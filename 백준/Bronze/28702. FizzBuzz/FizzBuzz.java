import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    static int isNumber(String str) throws Exception {

        try {
            Integer.parseInt(str);
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return 0;
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = new String[3];
        int num = 0; int target = 0;

        for (int i = 0; i < 3; i++) {
            input[i] = br.readLine();
        }

        br.close();

        for (int i = 0; i < 3; i++) {

            if (isNumber(input[i]) != 0) {
                num = Integer.parseInt(input[i]);
                target = num + (3 - i);
            }

        }

        if (target % 3 == 0 && target % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (target % 3 == 0) {
            System.out.println("Fizz");
        } else if (target % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(target);
        }

    }

}