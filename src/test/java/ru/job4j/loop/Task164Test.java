package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task164Test {
    private final String ln = System.lineSeparator();

    @Test
    public void whenTestThen10And11And12And13And14And15And16And17() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task164.loop();
        String expected = "10 11 12 13 14 15 16 17" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
