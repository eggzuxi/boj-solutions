import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] numbers = br.readLine().split(" ");
        int n = Integer.parseInt(numbers[0]);
        int k = Integer.parseInt(numbers[1]);
        br.close();

        LinkedList<Integer> circle = new LinkedList<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        int idx = 0;

        while (!circle.isEmpty()) {

            idx = (idx + k - 1) % circle.size();
            int num = circle.remove(idx);
            list.add(num);

        }

        System.out.print("<");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
        System.out.print(">");

    }
}