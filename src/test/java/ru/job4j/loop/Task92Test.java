package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task92Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when2And1And8And4Then4And6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task92.loop(2, 1, 8, 4);
        String expected = "4 6" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when6And2And12And4Then9() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task92.loop(6, 2, 12, 4);
        String expected = "9" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when6And2And9And3ThenError() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task92.loop(6, 2, 9, 3);
        String expected = "Нет чисел" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
