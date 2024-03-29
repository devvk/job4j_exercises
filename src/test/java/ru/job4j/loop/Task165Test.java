package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task165Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when10Then2And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task165.loop(10);
        String expected = "2 5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when7Then7() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task165.loop(7);
        String expected = "7" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when16Then2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task165.loop(16);
        String expected = "2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when60Then2And3And5() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task165.loop(60);
        String expected = "2 3 5" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when19Then19() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task165.loop(19);
        String expected = "19" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
