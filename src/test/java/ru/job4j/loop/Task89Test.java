package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task89Test {
    private final String ln = System.lineSeparator();

    @Test
    public void whenTestThen153And370And371And407And4() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task89.loop();
        String expected = "Числа: 153 370 371 407, Количество: 4" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
