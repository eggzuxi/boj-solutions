import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int num = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < size; i++){
            int a = sc.nextInt();
            if (a < num) {
                list.add(a);
            }
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }

        sc.close();

    }
}