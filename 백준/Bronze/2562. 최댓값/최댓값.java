import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 9; i++) {

            list.add(Integer.parseInt(br.readLine()));

        }

        int max = list.stream().max(Integer::compareTo).get();
        int idx = list.indexOf(list.stream().max(Integer::compareTo).get());
        System.out.println(max);
        System.out.println(idx + 1);



    }
}