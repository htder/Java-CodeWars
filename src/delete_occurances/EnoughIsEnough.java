package delete_occurances;

import java.util.*;

public class EnoughIsEnough {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{20, 37, 20, 21}, 1)));
        System.out.println(Arrays.toString(deleteNth(new int[]{20, 37, 20, 21}, 2)));

    }

    private static int[] deleteNth(int[] ints, int maxN) {
        Map<Integer, Integer> numberOccur = new HashMap<>();
        List<Integer> lessThanN = new ArrayList<>();

        for (Integer value  : ints) {
            if (numberOccur.containsKey(value)) {
                numberOccur.put(value, numberOccur.get(value) + 1);
            } else {
                numberOccur.putIfAbsent(value, 1);
            }

            if (numberOccur.get(value) <= maxN) {
                lessThanN.add(value);
            }
        }
        return lessThanN.stream().mapToInt(i -> i).toArray();
    }


}
