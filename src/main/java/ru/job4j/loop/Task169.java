package ru.job4j.loop;

import java.util.Scanner;

public class Task169 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int columnCount = in.nextInt();
        String star = "*";
        String space = " ";
        int starCount = columnCount;
        int spaceCount = 0;
        for (int i = 0; i < columnCount; i++) {
            System.out.println(space.repeat(spaceCount) + star.repeat(starCount));
            if (i < columnCount / 2) {
                spaceCount++;
                starCount -= 2;
            } else {
                spaceCount--;
                starCount += 2;
            }
        }

    }
}
