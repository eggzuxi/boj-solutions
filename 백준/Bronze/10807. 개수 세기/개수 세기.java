import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for (int j = 0; j < arr.length; j++) {
            if(arr[j] == target) {
                list.add(arr[j]);
            }
        }

        System.out.println(list.size());

    }
}