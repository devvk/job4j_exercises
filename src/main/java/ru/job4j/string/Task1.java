package ru.job4j.string;

public class Task1 {

    public static String maxMatch(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        for (int i = 0; i < strings[0].length(); i++) {
            char symbol = strings[0].charAt(i);
            for (int j = 1; j < strings.length; j++) {
                if (i == strings[j].length() || symbol != strings[j].charAt(i)) {
                    return strings[0].substring(0, i);
                }
            }

        }
        return strings[0];
    }
}
