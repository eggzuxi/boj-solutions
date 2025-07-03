import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n / 4; i++) {

            list.add("long");

        }

        String output = list.stream().collect(Collectors.joining(" "));
        System.out.print(output + " int");
        sc.close();

    }
}