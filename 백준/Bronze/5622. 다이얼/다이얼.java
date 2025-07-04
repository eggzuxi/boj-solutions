import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Map<String, Integer> dial = new LinkedHashMap<String, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int sum = 0;

        dial.put("A", 2); dial.put("B", 2); dial.put("C", 2);
        dial.put("D", 3); dial.put("E", 3); dial.put("F", 3);
        dial.put("G", 4); dial.put("H", 4); dial.put("I", 4);
        dial.put("J", 5); dial.put("K", 5); dial.put("L", 5);
        dial.put("M", 6); dial.put("N", 6); dial.put("O", 6);
        dial.put("P", 7); dial.put("Q", 7); dial.put("R", 7); dial.put("S", 7);
        dial.put("T", 8); dial.put("U", 8); dial.put("V", 8);
        dial.put("W", 9); dial.put("X", 9); dial.put("Y", 9); dial.put("Z", 9);

        for (int i = 0; i <input.length(); i++) {

            char ch = input.charAt(i);
            String key = String.valueOf(ch);

            if (dial.containsKey(key)) {
                sum += dial.get(key) + 1;
            }

        }

        System.out.println(sum);
        br.close();

    }
}