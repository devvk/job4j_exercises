package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task70Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when003And001122Then0And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] array = {0, 0, 1, 1, 2, 2};
        Task70.loop(0, 0, 3, array);
        String expected = "На окружности: 0, внутри: 3" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when003And334455Then0And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] array = {3, 3, 4, 4, 5, 5};
        Task70.loop(0, 0, 3, array);
        String expected = "На окружности: 0, внутри: 0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when005And344311Then2And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] array = {3, 4, 4, 3, 1, 1};
        Task70.loop(0, 0, 5, array);
        String expected = "На окружности: 2, внутри: 1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when005And344355Then2And0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] array = {3, 4, 4, 3, 5, 5};
        Task70.loop(0, 0, 5, array);
        String expected = "На окружности: 2, внутри: 0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
