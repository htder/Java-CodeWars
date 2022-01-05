package disemvowel_trolls;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Troll {
    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
        System.out.println(disemvowel("No offense but,\nYour writing is among the worst I've ever read"));
        System.out.println(disemvowel("What are you, a communist?"));

        System.out.println(disemvowelV2("This website is for losers LOL!"));
    }

    public static String disemvowel(String str) {
        return Arrays.stream(str.split(""))
                .filter(letter -> letter.matches("(?i)[^aeiou]"))
                .collect(Collectors.joining(""));
    }

    public static String disemvowelV2(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
