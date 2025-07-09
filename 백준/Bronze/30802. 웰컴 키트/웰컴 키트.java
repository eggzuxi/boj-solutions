import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input1 = br.readLine().split(" ");
        String[] input2 = br.readLine().split(" ");
        br.close();

        int[] people = Arrays.stream(input1).mapToInt(Integer::parseInt).toArray();
        int[] nums = Arrays.stream(input2).mapToInt(Integer::parseInt).toArray();

        int t = 0;
        int p = 0;
        int q = 0;
        int r = nums[0];
        int s = nums[1];

        for (int i = 0; i < people.length; i++) {

            if (people[i] == 0) {

            } else if (people[i] % r == 0) {
                t += people[i] / r;
            } else {
                t += people[i] / r + 1;
            }

        }

        p = n / s;
        q = n % s;

        System.out.println(t);
        System.out.println(p + " " + q);


    }
}