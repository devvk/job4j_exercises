package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

public class Task2Test {

    @Test
    public void out2to4() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task2.loop(2, 4);
        var expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("2").add("3").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void out1to3() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task2.loop(1, 3);
        var expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("1").add("2").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }
}
