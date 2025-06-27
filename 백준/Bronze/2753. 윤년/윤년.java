import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public int solution(int year) throws Exception {

        int result;

        if ( year % 4 == 0 ) {

            result = (year % 100 !=0 || year % 400 == 0 ) ? 1 : 0;

        } else {

            result = 0;

        }

        return result;

    }

    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = new Main().solution(n);

        System.out.println(result);

    }
}