package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

public class Task107Test {
    private final String ln = System.lineSeparator();

    @Test
    public void whenMinus5And2And40And999And19ThenMinus5And2And40And3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {-5, 2, 40, 999, 19};
        Task107.loop(num);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-5").add("2").add("40").add("Значений: 3");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }

    @Test
    public void when999And2And40And0And19Then0() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {999, 2, 40, 0, 19};
        Task107.loop(num);
        String expected = "Значений: 0" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void whenMinus7And5And999And10And39ThenMinus7And5And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        int[] num = {-7, 5, 999, 10, 39};
        Task107.loop(num);
        StringJoiner expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator())
                .add("-7").add("5").add("Значений: 2");
        assertThat(out.toString()).isEqualTo(expected.toString());
    }
}
