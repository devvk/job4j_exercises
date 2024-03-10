package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

public class Task1Test {

    @Test
    public void out3() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task1.loop(3);
        var expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("0").add("1").add("2").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void out2() {
        var out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task1.loop(2);
        var expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("0").add("1").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }
}
