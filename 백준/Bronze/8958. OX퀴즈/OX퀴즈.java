import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String s = br.readLine();
            int totalScore = 0;
            int score = 0;

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == 'O') {
                    score++;
                    totalScore += score;
                } else {
                    score = 0;
                }

            }

            System.out.println(totalScore);

        }

        br.close();
        
    }
}