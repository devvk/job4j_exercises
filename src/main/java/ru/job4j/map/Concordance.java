package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char symbol = s.charAt(i);
            if (symbol != ' ') {
                map.computeIfAbsent(symbol, value -> new ArrayList<>()).add(i);
            }
        }
        return map;
    }
}
