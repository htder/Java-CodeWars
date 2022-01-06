package vowel_count;

import java.util.Arrays;

public class Vowels {

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
        System.out.println(getCount2("abracadabra"));
    }

    public static int getCount(String str) {
        return Math.toIntExact(Arrays.stream(str.split(""))
                .filter(letter -> letter.matches("[aeiou]"))
                .count());
    }

    public static int getCount2(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
