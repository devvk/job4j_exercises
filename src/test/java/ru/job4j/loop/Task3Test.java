package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

public class Task3Test {

    @Test
    public void out3() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task3.loop(3);
        String expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("2").add("1").add("0").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void out2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task3.loop(2);
        String expected = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                .add("1").add("0").toString();
        assertThat(out.toString()).isEqualTo(expected);
    }
}
