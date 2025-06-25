import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public void dog() throws Exception {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String space = " ";
        String twoSpace = "  ";

        String dog1 = "|\\_/|";
        String dog2 = "|q p|" + space + twoSpace + "/}";
        String dog3 = "( 0 )\"\"\"\\";
        String dog4 = "|\"^\"`" + twoSpace + twoSpace + "|";
        String dog5 = "||_/=\\\\__|";

        bw.write(dog1);
        bw.newLine();
        bw.write(dog2);
        bw.newLine();
        bw.write(dog3);
        bw.newLine();
        bw.write(dog4);
        bw.newLine();
        bw.write(dog5);

        bw.flush();

    }

    public static void main(String[] args) throws Exception {

        new Main().dog();

    }
}