import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int floor = 0; int room = 0;

        for (int i = 0; i < t; i++) {

            String s = br.readLine();
            String[] ss = s.split(" ");
            int h = Integer.parseInt(ss[0]);
            int w = Integer.parseInt(ss[1]);
            int n = Integer.parseInt(ss[2]);

            floor = (n - 1) % h + 1;
            room = (n - 1) / h + 1;

            System.out.printf("%d%02d\n", floor, room);

        }
        
        br.close();

    }
}