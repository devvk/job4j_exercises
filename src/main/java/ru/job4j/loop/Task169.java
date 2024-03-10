package ru.job4j.loop;

public class Task169 {
    public static void main(String[] args) {
        int columnCount = 5;
        String star = "*";
        String space = " ";

        for (int i = 0; i < columnCount; i++) {
            for (int j = 0; j < columnCount - i; j++) {
                System.out.print(star);
                System.out.println(space);
            }
            System.out.println();
        }

    }
}
