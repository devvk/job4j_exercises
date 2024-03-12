package ru.job4j.array;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task78Test {
    private final String ln = System.lineSeparator();

    @Test
    public void when554331Then4And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 5, 4, 3, 3, 1};
        Task78.array(arr);
        String expected = "4 1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when54331Then5And4And1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 4, 3, 3, 1};
        Task78.array(arr);
        String expected = "5 4 1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void when5533ThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {5, 5, 3, 3};
        Task78.array(arr);
        assertThat(out.toString()).isEqualTo(ln);
    }

    @Test
    public void when1Then1() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {1};
        Task78.array(arr);
        String expected = "1" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenEmptyThenEmptyString() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] arr = {};
        Task78.array(arr);
        assertThat(out.toString()).isEqualTo(ln);
    }
}
