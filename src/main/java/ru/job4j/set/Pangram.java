package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        Set<Character> set = new HashSet<>();
        s = s.replace(" ", "");
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size() == 26;
    }
}
