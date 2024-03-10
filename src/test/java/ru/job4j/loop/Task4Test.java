package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task4Test {
    private final String ln = System.lineSeparator();

    @Test
    public void test() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task4.loop(5, 1);
        String expected = "5" + ln + "4" + ln + "3" + ln + "2" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }

}
