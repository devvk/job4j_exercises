package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task102Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when0And1And2And3And4Then4AndNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {0, 1, 2, 3, 4};
        Task102.loop(num);
        String expected = "Max: 4, min: Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus4AndMinus3AndMinus2AndMinus1And0ThenNoAndMinus4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {-4, -3, -2, -1, 0};
        Task102.loop(num);
        String expected = "Max: Нет, min: -4" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus2AndMinus1And0And1And2Then2AndMinus2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {-2, -1, 0, 1, 2};
        Task102.loop(num);
        String expected = "Max: 2, min: -2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
