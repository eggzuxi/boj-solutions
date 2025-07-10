import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    static boolean isVPS(char[] chars) {

        Stack<Character> stack = new Stack<>();

        for (char c : chars) {

            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }

        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {

            String ps = br.readLine();
            char[] chars = ps.toCharArray();

            if (isVPS(chars)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }

        br.close();

    }
}