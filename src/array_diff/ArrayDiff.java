package array_diff;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayDiff {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{}, new int[]{1,2})));

    }

    private static int[] arrayDiff(int[] ints, int[] ints1) {
        if (ints1.length == 0 || ints.length == 0) return ints;
        Map<Integer, Integer> removeValues = new HashMap<>();

        Arrays.stream(ints1)
                .forEach(i -> removeValues.putIfAbsent(i, 1));
        return Arrays.stream(ints)
                .filter(value -> !(removeValues.containsKey(value)))
                .toArray();
    }
}
