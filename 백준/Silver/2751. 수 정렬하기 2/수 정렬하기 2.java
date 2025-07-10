import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            list.add(num);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            bw.write(list.get(i) + "\n");
        }

        bw.flush();
        br.close();

    }
}