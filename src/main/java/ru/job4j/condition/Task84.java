package ru.job4j.condition;

public class Task84 {
    public static boolean check(String left, String right) {
        if (left.charAt(0) == right.charAt(0)) {
            return true;
        }
        return left.charAt(1) == right.charAt(1);
    }
}
