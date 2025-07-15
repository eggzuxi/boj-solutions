import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] people = new int[t][2];

        for (int i = 0; i < t; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            people[i][0] = Integer.parseInt(st.nextToken());
            people[i][1] = Integer.parseInt(st.nextToken());
        }

        br.close();

        List<Integer> ranking = new ArrayList<>();

        for (int i = 0; i < people.length; i++) {
            ranking.add(1);
        }

        for (int i = 0; i < t; i++) {

            int w = people[i][0], h = people[i][1];

            for (int j = 0; j < t; j++) {

                int x = people[j][0], y = people[j][1];
                if (w < x && h < y) {
                    int num = ranking.get(i);
                    num++;
                    ranking.set(i, num);
                }

            }

        }

        for (int i = 0; i < ranking.size(); i++) {
            System.out.print(ranking.get(i) + " ");
        }

    }
}