package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task48Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when5Then1And2And3And4And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.loop(5);
        String expected = "1+2+3+4+5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when8Then1And2And3And4And5And6And7And8() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.loop(8);
        String expected = "1+2+3+4+5+6+7+8" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when3Then1And2And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.loop(3);
        String expected = "1+2+3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task48.loop(1);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
