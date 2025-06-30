import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String n = br.readLine();
        int num = Integer.parseInt(n);

        Character result = s.charAt(num - 1);

        System.out.println(result);

    }
}