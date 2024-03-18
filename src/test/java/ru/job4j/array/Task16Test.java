package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Task16Test {
    @Test
    public void test1() {
        String[] result = convert(Task16.split("one two".toCharArray(), ' '));
        String[] expected = new String[]{"one", "two"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void test2() {
        String[] result = convert(Task16.split("one two three".toCharArray(), ' '));
        String[] expected = new String[]{"one", "two", "three"};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void test3() {
        String[] result = convert(Task16.split("onetwothree".toCharArray(), ' '));
        String[] expected = new String[]{"onetwothree"};
        assertThat(result).isEqualTo(expected);
    }

    private String[] convert(char[][] splitted) {
        String[] result = new String[splitted.length];
        int ri = 0;
        for (char[] row : splitted) {
            result[ri++] = new String(row);
        }
        return result;
    }

}
