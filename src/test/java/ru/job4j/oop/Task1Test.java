package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.assertj.core.api.Assertions.assertThat;

public class Task1Test {
    @Test
    public void checkMainOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task1.main(null);
        String expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()
        ).add("I would like to drink a cup of tea.")
                .toString();
        assertThat(out.toString()).isEqualTo(expected);
    }

    @Test
    public void checkTeaOutput() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Tea().prepare();
        String expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()
        ).add("I would like to drink a cup of tea.")
                .toString();
        assertThat(out.toString()).isEqualTo(expected);
    }
}
