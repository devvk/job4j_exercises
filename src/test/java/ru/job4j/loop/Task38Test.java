package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task38Test {
    private final String ln = System.lineSeparator();

    @Test
    public void whenTestThen200And202And204And206And208And220And222() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task38.loop();
        String expected = "200 202 204 206 208 220 222" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
