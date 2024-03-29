package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task122Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when11And222And36And23And10Then11And222And36() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {11, 222, 36, 23, 10};
        Task122.loop(nums);
        String expected = "11 222 36" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when41And55And32ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {41, 55, 32};
        Task122.loop(nums);
        assertThat(out.toString()).isEqualTo(ln);
    }

    @Test
    public void when40And41And42Then40() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {40, 41, 42};
        Task122.loop(nums);
        String expected = "40" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
