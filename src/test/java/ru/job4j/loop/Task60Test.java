package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task60Test {
    private final String ln = System.lineSeparator();

    @Test
    public void whenTestThen6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task60.loop();
        String expected = "6" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
