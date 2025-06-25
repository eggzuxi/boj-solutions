import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public void Solution() throws Exception {

        String space = " ";
        String twoSpace = "  ";

        String firstLine = "\\" + twoSpace + twoSpace + "/\\";
        String secondLine = space + ")" + twoSpace + "( ')";
        String thirdLine = "(" + twoSpace + "/" + twoSpace + ")";
        String fourthLine = space + "\\(__)|";

        System.out.println(firstLine);
        System.out.println(secondLine);
        System.out.println(thirdLine);
        System.out.println(fourthLine);

    }

    public static void main(String[] args) throws Exception {

        new Main().Solution();

    }
}