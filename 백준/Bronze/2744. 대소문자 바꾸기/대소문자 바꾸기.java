import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }

        }

        System.out.println(sb.toString());
        br.close();


    }
}