package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task143Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when15And50Then5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task143.loop(15, 50);
        String expected = "5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when12And40Then4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task143.loop(12, 40);
        String expected = "4" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when18And7Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task143.loop(18, 7);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when36And9Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task143.loop(36, 9);
        String expected = "9" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
