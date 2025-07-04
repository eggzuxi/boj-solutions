import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        br.close();

        Map<Character, Integer> count = new HashMap<>();

        for (char c : word.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = '?';
        int maxCount = 0;
        boolean isTie = false;

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            char currentChar = entry.getKey();
            int currentCount = entry.getValue();

            if (currentCount > maxCount) {

                maxCount = currentCount;
                mostFrequentChar = currentChar;
                isTie = false;

            } else if (currentCount == maxCount) {
                isTie = true;
            }
        }

        if (isTie) {
            System.out.println("?");
        } else {
            System.out.println(mostFrequentChar);
        }
    }
}