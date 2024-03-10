package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task8Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task8.loop(1);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task8.loop(2);
        String expected = "1" + ln + "2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task8.loop(6);
        String expected = "1" + ln + "2" + ln + "3" + ln + "6" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

}
