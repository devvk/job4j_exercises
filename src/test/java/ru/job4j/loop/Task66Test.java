package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task66Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when30Then6And2And3And5And6And10And15() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.loop(30);
        String expected = "Количество: 6, Делители: 2 3 5 6 10 15" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when10Then2And2And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.loop(10);
        String expected = "Количество: 2, Делители: 2 5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.loop(1);
        String expected = "Количество: 0, Делители: 0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when17Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task66.loop(17);
        String expected = "Количество: 0, Делители: 0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
