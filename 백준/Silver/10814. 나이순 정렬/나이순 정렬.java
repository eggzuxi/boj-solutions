import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String[][] users = new String[t][2];

        for (int i = 0; i < t; i++) {
            String[] str = br.readLine().split(" ");
            users[i][0] = str[0];
            users[i][1] = str[1];
        }

        br.close();

        Arrays.sort(users, (a, b) -> {

            int age1 = Integer.parseInt(a[0]);
            int age2 = Integer.parseInt(b[0]);

            if (age1 == age2) {
                return 0;
            } else {
                return Integer.compare(age1, age2);
            }
        });

        for (int i = 0; i < t; i++) {
            System.out.println(users[i][0]  + " " + users[i][1]);
        }

    }
}