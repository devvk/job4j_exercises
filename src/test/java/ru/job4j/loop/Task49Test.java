package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task49Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when10And3Then4And6And8And10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task49.loop(10, 3);
        String expected = "4+6+8+10" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when3And10Then4And6And8And10() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task49.loop(3, 10);
        String expected = "4+6+8+10" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1And1ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task49.loop(1, 1);
        assertThat(out.toString()).isEqualTo(ln);
    }

    @Test
    public void when2And2Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task49.loop(2, 2);
        String expected = "2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
