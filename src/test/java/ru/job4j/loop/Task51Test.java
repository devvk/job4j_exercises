package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task51Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when7And2Then0And9And0And25And0And49() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.loop(7, 2);
        String expected = "0 9 0 25 0 49" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when2And7Then0And9And0And25And0And49() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.loop(2, 7);
        String expected = "0 9 0 25 0 49" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1And1Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.loop(2, 2);
        String expected = "0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when3And3Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task51.loop(3, 3);
        String expected = "9" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
