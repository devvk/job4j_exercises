package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class Task44Test {
    private final String ln = System.lineSeparator();

    @Test
    public void whenTestThen144And169And288And441And528And768And825And867And882And961() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task44.loop();
        String expected = "144 169 288 441 528 768 825 867 882 961" + ln;
        assertThat(out.toString()).isEqualTo(expected);
    }
}
