package find_min_max;

import java.util.Arrays;

public class MinMax {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(minMax(new int[]{2334454, 5})));
        System.out.println(Arrays.toString(minMax(new int[]{1})));

        System.out.println();

        System.out.println(Arrays.toString(minMax1(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(minMax1(new int[]{2334454, 5})));
        System.out.println(Arrays.toString(minMax1(new int[]{1})));

    }


    public static int[] minMax(int[] ints) {
        int min = Arrays.stream(ints).min().getAsInt();
        int max = Arrays.stream(ints).max().getAsInt();
        return new int[]{min, max};
    }

    public static int[] minMax1(int[] ints) {
        Arrays.sort(ints);
        return new int[]{ints[0], ints[ints.length - 1]};
    }

}