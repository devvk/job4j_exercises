package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task88Test {
    private final String ln = System.lineSeparator();

    @Test
    public void whenTestThen15And24And2() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task88.loop();
        String expected = "Числа: 15 24, Количество: 2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
