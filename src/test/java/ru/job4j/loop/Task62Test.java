package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task62Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when4And2135ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {2, 1, 3, 5};
        Task62.loop(4, rsl);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when5And32145ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {3, 2, 1, 4, 5};
        Task62.loop(5, rsl);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when5And22145ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] rsl = {2, 2, 1, 4, 5};
        Task62.loop(5, rsl);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}