package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task111Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when5Then6And7And8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task111.loop(5);
        String expected = "6 7 8" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when3Then4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task111.loop(3);
        String expected = "4" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when4Then5And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task111.loop(4);
        String expected = "5 6" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task111.loop(1);
        assertThat(out.toString()).isEqualTo(ln);
    }
}
