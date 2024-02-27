package ru.job4j.condition;

public class Task81 {
    public static void isLatin(char s) {
        if ((s >= 65 && s <= 90) || (s >= 97 && s <= 122)) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
