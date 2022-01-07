package regex_validate;

public class Solution {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("00000"));
        System.out.println(validatePin("12as"));
        System.out.println(validatePin("1234123a"));

    }

    public static boolean validatePin(String pin) {
        return pin.matches("(\\d{4}|\\d{6})");
    }
}
