package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task115Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when123426Then10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 2, 3, 4, 2, 6};
        Task115.loop(nums);
        String expected = "10" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when11Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 1};
        Task115.loop(nums);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when12335Then6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] nums = {1, 2, 3, 3, 5};
        Task115.loop(nums);
        String expected = "6" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
