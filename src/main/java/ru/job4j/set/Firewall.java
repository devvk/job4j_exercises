package ru.job4j.set;

import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        boolean isFound = false;
        for (String word : words) {
            if (s.contains(word)) {
                isFound = true;
                break;
            }
        }
        return isFound ? "Выберите другую статью..." : "Вы сделали правильный выбор!";
    }
}
