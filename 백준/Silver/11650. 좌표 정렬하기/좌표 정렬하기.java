import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] loc = new int[t][2];

        for (int i = 0; i < t; i++) {
            String[] dot = br.readLine().split(" ");
            loc[i][0] = Integer.parseInt(dot[0]);
            loc[i][1] = Integer.parseInt(dot[1]);
        }

        br.close();

        Arrays.sort(loc, (arr1, arr2) -> {

            if (arr1[0] == arr2[0]) {
                return Integer.compare(arr1[1], arr2[1]);
            } else {
                return Integer.compare(arr1[0], arr2[0]);
            }

        });

        Arrays.stream(loc).forEach(x -> System.out.println(x[0] + " " + x[1]));

    }
}