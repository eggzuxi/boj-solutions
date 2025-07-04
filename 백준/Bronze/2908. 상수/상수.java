import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        String a = input[0];
        String b = input[1];

        ArrayList<Integer> numA = new ArrayList<>();
        ArrayList<Integer> numB = new ArrayList<>();

        for (int i = 0; i < a.length(); i++) {
            numA.add(a.charAt(i) - '0');
        }

        for (int i = 0; i < b.length(); i++) {
            numB.add(b.charAt(i) - '0');
        }

        Collections.reverse(numA);
        Collections.reverse(numB);

        String sortedA = numA.stream().map(String::valueOf).collect(Collectors.joining());
        String sortedB = numB.stream().map(String::valueOf).collect(Collectors.joining());

        if (sortedA.compareTo(sortedB) > 0) {
            System.out.println(sortedA);
        } else {
            System.out.println(sortedB);
        }

        br.close();

    }

}