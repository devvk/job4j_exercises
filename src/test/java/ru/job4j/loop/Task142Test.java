package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task142Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when34ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task142.loop(34);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when0ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task142.loop(0);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when1ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task142.loop(1);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when2ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task142.loop(2);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when144ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task142.loop(144);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when89ThenYes() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task142.loop(89);
        String expected = "Да" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when88ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task142.loop(88);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when11ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task142.loop(11);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when59ThenNo() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task142.loop(59);
        String expected = "Нет" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
