package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task166Test {
    private final String ln = System.lineSeparator();

    @Test
    public void whenTestThen190And270And290() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task166.loop();
        String expected = "190 270 290" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
