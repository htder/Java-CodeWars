package detect_pangram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DetectPangram {
    public static void main(String[] args) {
        System.out.println(check("The quick brown fox jumps over the lazy dog."));
        System.out.println(check("You shall not pass!"));

        System.out.println(check2("The quick brown fox jumps over the lazy dog."));
        System.out.println(check2("You shall not pass!"));
    }

    public static boolean check(String sentence) {
        Map<String,Integer> letters = new HashMap<>();

        Arrays.stream(sentence.split(""))
                .filter(item -> item.matches("[a-zA-Z]"))
                .forEach(letter -> letters.putIfAbsent(letter.toLowerCase(), 1));
        return letters.size() == 26;
    }

    public static boolean check2(String sentence) {
        return sentence.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .distinct()
                .count() == 26;
    }
}
