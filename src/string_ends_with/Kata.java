package string_ends_with;

public class Kata {
    public static void main(String[] args) {
        System.out.println(solution("abc", "bc"));
        System.out.println(solution("abc", "d"));
        System.out.println(solution("abc", ""));
        System.out.println(solution("samurai", "ai"));

        System.out.println(solution1("abc", ""));
        System.out.println(solution1("samurai", "ai"));
    }

    public static boolean solution(String whole, String ending) {
        return whole.endsWith(ending);
    }

    public static boolean solution1(String whole, String ending) {
        if (whole.length() < ending.length()) {
            return false;
        } else {
            return whole.substring(whole.length() - ending.length()).equals(ending);
        }
    }
}
