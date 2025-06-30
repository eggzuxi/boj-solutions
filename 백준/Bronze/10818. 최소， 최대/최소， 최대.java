import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            list.add(sc.nextInt());
        }

        int max = list.stream().max(Integer::compareTo).get();
        int min = list.stream().min(Integer::compareTo).get();

        System.out.println(min + " " + max);
        sc.close();

    }
}