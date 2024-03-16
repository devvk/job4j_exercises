package ru.job4j.array;

import java.util.HashMap;
import java.util.Map;

public class Task83 {
    public static int[] sumOfTwo(int[] numbers, int goal) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = goal - numbers[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(numbers[i], i);
        }
        return null;
    }
}
