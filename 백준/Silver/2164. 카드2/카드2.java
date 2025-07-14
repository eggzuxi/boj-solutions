import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        LinkedList<Integer> list = new LinkedList<>();
        br.close();

        for (int i = 0; i < n; i++) {
            list.add(i + 1);
        }

        while (list.size() > 1) {

            list.removeFirst();

            if (list.size() == 1) {
                break;
            }

            int num = list.removeFirst();
            list.addLast(num);

        }

        System.out.println(list.get(0));

    }
}