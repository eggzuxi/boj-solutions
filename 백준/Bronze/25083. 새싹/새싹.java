import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public void sprout() throws Exception {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String space = " ";
        String spaceTwo = " ".repeat(2);
        String spaceThree = " ".repeat(3);
        String spaceFour = " ".repeat(4);
        String spaceSix = " ".repeat(6);
        String spaceNine = " ".repeat(9);

        String sprout1 = spaceNine + ",r\'\"7";
        String sprout2 = "r`-_" + spaceThree + ",\'" + spaceTwo + ",/";
        String sprout3 = space + "\\. \". L_r\'";
        String sprout4 = spaceThree + "`~\\/";
        String sprout5 = spaceSix + "|";

        bw.write(sprout1);
        bw.newLine();
        bw.write(sprout2);
        bw.newLine();
        bw.write(sprout3);
        bw.newLine();
        bw.write(sprout4);
        bw.newLine();
        bw.write(sprout5);
        bw.newLine();
        bw.write(sprout5);

        bw.flush();


    }

    public static void main(String[] args) throws Exception {

        new Main().sprout();

    }
}