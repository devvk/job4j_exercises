package ru.job4j.array;

import java.util.Arrays;

public class Task16 {
    public static char[][] split(char[] chars, char ch) {
        char[][] result = new char[chars.length / 2][];
        int commonCount = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ch) {
                sb.append(chars[i]);
            }
            if (chars[i] == ch || i == chars.length - 1) {
                result[commonCount++] = sb.toString().toCharArray();
                sb = new StringBuilder();
            }
        }
        return Arrays.copyOf(result, commonCount);
    }
}
