package ru.job4j.map;

import java.util.Map;
import java.util.TreeMap;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        char result = ' ';
        Map<Character, Integer> map = new TreeMap<>();
        str = str.toLowerCase().replace(" ", "");
        for (char c : str.toCharArray()) {
            map.computeIfPresent(c, (key, value) -> value + 1);
            map.putIfAbsent(c, 1);
        }
        int maxValue = 0;
        for (Character key : map.keySet()) {
            if (map.get(key) > maxValue) {
                maxValue = map.get(key);
                result = key;
            }
        }
        return result;
    }
}
