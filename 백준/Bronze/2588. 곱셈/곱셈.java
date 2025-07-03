import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        List<Integer> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            list.add(Character.getNumericValue(c));
        }

        int a = list.get(2);
        int b = list.get(1);
        int c = list.get(0);

        int first = n * a;
        int second = n * b;
        int third = n * c;

        int sum = first + second * 10 + third * 100;

        System.out.printf(first + "\n" + second + "\n" + third + "\n" + sum);

        br.close();

    }
}