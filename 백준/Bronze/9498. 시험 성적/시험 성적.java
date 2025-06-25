import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public void grade() throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String grade;

        if (90 <= n && n <= 100) {
            grade = "A";
        } else if (80 <= n && n < 90) {
            grade = "B";
        } else if (70 <= n && n < 80) {
            grade = "C";
        } else if (60 <= n && n < 70) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println(grade);

    }

    public static void main(String[] args) throws Exception{

        new Main().grade();

    }
}