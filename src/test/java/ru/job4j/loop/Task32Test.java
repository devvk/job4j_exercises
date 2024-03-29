package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task32Test {
    private final String ln = System.lineSeparator();

    @Test
    public void whenTestThen47And37And27And17() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task32.loop();
        String expected = "47 37 27 17" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
