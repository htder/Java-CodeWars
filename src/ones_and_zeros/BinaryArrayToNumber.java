package ones_and_zeros;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {

    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 1, 1))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 1, 1, 0))));
        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 1))));

    }

    public static int ConvertBinaryArrayToInt(List<Integer> integers) {
        StringBuilder arrayString = new StringBuilder();
        for (int value : integers) {
            arrayString.append(value);
        }
        return Integer.parseInt(String.valueOf(arrayString), 2);
    }
}
