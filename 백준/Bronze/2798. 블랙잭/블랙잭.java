import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int max = Integer.parseInt(input[1]);
        String[] card = br.readLine().split(" ");
        int[] cards = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            cards[i] = Integer.parseInt(card[i]);
        }

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {

                    int current = cards[i] + cards[j] + cards[k];

                    if (current <= max) {

                        if(current >= sum) {
                            sum = current;
                        }

                    }

                }
            }

        }

        System.out.println(sum);
        br.close();

    }
}