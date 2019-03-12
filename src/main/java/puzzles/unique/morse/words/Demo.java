package puzzles.unique.morse.words;

import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        String[] words = {"gin", "zen", "gig", "msg"};

        String[] codes = {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> out = new HashSet<>();
        for (String word : words) {
            StringBuilder outString = new StringBuilder();
            for (char s : word.toCharArray()) {
                outString.append(codes[s - 'a']);
            }
            out.add(outString.toString());
        }

        System.out.println(out);
    }
}
