import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        for (int i = 0; i < t; i++) {

            String[] input = br.readLine().split(" ");
            if (input.length == 2) {
                q.add(Integer.parseInt(input[1]));
            } else {

                if (input[0].equals("pop")) {

                    if (q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(q.removeFirst());
                    }

                }

                else if (input[0].equals("size")) {
                    System.out.println(q.size());
                }

                else if (input[0].equals("empty")) {
                    if (q.isEmpty()) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                }

                else if (input[0].equals("front")) {
                    if (q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(q.peekFirst());
                    }
                }

                else if (input[0].equals("back")) {
                    if (q.isEmpty()) {
                        System.out.println(-1);
                    } else {
                        System.out.println(q.peekLast());
                    }
                }

            }

        }

        br.close();

    }
}