package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task52Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when5And3Then5And6And7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task52.loop(5, 3);
        String expected = "5 6 7" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when2And5Then5And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task52.loop(2, 5);
        String expected = "5 6" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when3And3Then3And4And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task52.loop(3, 3);
        String expected = "3 4 5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
