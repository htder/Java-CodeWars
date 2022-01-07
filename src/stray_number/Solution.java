package stray_number;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
    }

    public static int stray(int[] values) {
        Map<Integer, Integer> countValues = new HashMap<>();
        for (int number : values) {
            if (!countValues.containsKey(number)) {
                countValues.put(number, 1);
            } else {
                countValues.put(number, countValues.get(number) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : countValues.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }
}
