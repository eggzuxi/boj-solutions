import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        double[] numbers = new double[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = Double.parseDouble(input[i]);
        }

        double[] newScores = new double[n];
        double max = Arrays.stream(numbers).max().getAsDouble();

        for (int i = 0; i < n; i++) {

            newScores[i] = numbers[i] / max * 100;

        }

        double avg = Arrays.stream(newScores).sum() / newScores.length;

        System.out.println(avg);

        br.close();

    }
}