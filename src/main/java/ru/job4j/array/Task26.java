package ru.job4j.array;

public class Task26 {
    public static String convert(String[] fio) {
        StringBuilder sb = new StringBuilder(fio[0]).append(" ");
        for (int i = 1; i < fio.length; i++) {
            sb.append(fio[i].charAt(0));
            sb.append(".");
        }
        return sb.toString();
    }
}
