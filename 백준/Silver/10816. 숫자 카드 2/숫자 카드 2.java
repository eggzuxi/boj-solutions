import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t1 = Integer.parseInt(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] input = br.readLine().split(" ");

        for (int i = 0; i < t1; i++) {
            int num = Integer.parseInt(input[i]);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int t2 = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        for (int i = 0; i < t2; i++) {

            int key = Integer.parseInt(str[i]);
            int result = 0;

            if (map.get(key) != null) {
                result = map.get(key).intValue();
                bw.write(result + " ");
            } else {

                bw.write(0 + " ");
            }

        }

        bw.flush();
        br.close();

    }
}