import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();

        for (int i = 0; i < n; i++) {
            words.add(br.readLine());
        }

        br.close();

        ArrayList<String> wordList = new ArrayList<>(words);
        Collections.sort(wordList, (s1, s2) -> {
            if (s1.length() != s2.length()) {
                return s1.length() - s2.length();
            } else {
                return s1.compareTo(s2);
            }
        });

        wordList.stream().forEach(System.out::println);

    }
}