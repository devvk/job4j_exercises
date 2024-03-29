package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task30Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when34Then104And114And124() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.loop(34);
        String expected = "104 114 124" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1Then101And111And121() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.loop(1);
        String expected = "101 111 121" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when129Then109And119And129() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task30.loop(129);
        String expected = "109 119 129" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
