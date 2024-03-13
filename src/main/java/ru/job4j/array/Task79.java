package ru.job4j.array;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringJoiner;

public class Task79 {
    public static void array(int[] nums) {
        StringJoiner sj = new StringJoiner(" ");
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int number : nums) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                sj.add(String.valueOf(entry.getKey()));
            }
        }
        if (sj.length() > 0) {
            System.out.println(sj);
        } else {
            System.out.print("");
        }
    }
}
