package square_of_squares;

public class Square {
    public static void main(String[] args) {
        System.out.println(isSquare(-1));
        System.out.println(isSquare(0));
        System.out.println(isSquare(3));
        System.out.println(isSquare1(4));
        System.out.println(isSquare1(25));
        System.out.println(isSquare1(26));
    }

    private static boolean isSquare(int value) {
        if (value < 0) return false;
        if (value == 0) return true;
        return value % Math.sqrt(value) == 0;
    }

    private static boolean isSquare1(int value) {
        return Math.sqrt(value) % 1 == 0;
    }
}
