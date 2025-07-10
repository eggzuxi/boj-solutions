import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            String s = br.readLine();

            if (s.split(" ").length == 2) {
                int num = Integer.parseInt(s.split(" ")[1]);
                stack.push(num);
            }

            if (s.equals("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    int result = stack.pop();
                    System.out.println(result);
                }
            }

            if (s.equals("size")) {
                int result = stack.size();
                System.out.println(result);
            }

            if (s.equals("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }

            if (s.equals("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    int result = stack.peek();
                    System.out.println(result);
                }
            }

        }
        
        br.close();

    }
}