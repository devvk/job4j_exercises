package ru.job4j.loop;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task5Test {
    private final String ln = System.lineSeparator();

    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task5.loop(10);
        String expected = "10" + ln + "20" + ln + "30" + ln + "40" + ln + "50" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

}
