import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNext()) {
            int n = sc.nextInt();
            sum = sum + n*n;
        }

        int result = sum % 10;
        System.out.println(result);
        
        sc.close();

    }
}