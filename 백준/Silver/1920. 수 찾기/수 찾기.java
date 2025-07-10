import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str1 = br.readLine().split(" ");
        int m = Integer.parseInt(br.readLine());
        String[] str2 = br.readLine().split(" ");
        br.close();

        HashSet<Integer> list1 = new HashSet<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list1.add(Integer.parseInt(str1[i]));
        }

        for (int i = 0; i < m; i++) {
            list2.add(Integer.parseInt(str2[i]));
        }

        for (int i = 0; i < m; i++) {

            boolean isPresent = list1.contains(list2.get(i));
            if (isPresent) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }

    }
}