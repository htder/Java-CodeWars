package boolean_to_string;

public class YesOrNo {
    public static void main(String[] args) {
        System.out.println(boolToWord(true));
        System.out.println(boolToWord(false));
    }

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }
}
