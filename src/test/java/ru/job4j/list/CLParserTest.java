package ru.job4j.list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CLParserTest {

    @Test
    public void whenFlagO() {
        String[] args = new String[]{"-o", "/some/path"};
        CLParser parser = new CLParser(args);
        parser.parse();
        assertThat(parser.hasOutputPath()).isTrue();
        assertThat(parser.outputPath()).isEqualTo("/some/path");
    }

    @Test
    public void whenFlagP() {
        String[] args = new String[]{"-p", "log_"};
        CLParser parser = new CLParser(args);
        parser.parse();
        assertThat(parser.hasPrefix()).isTrue();
        assertThat(parser.prefix()).isEqualTo("log_");
    }

    @Test
    public void whenFlagS() {
        String[] args = new String[]{"-s"};
        CLParser parser = new CLParser(args);
        parser.parse();
        assertThat(parser.isShortStatistic()).isTrue();
    }

    @Test
    public void whenFlagF() {
        String[] args = new String[]{"-f"};
        CLParser parser = new CLParser(args);
        parser.parse();
        assertThat(parser.isFullStatistic()).isTrue();
    }

    @Test
    public void whenFlagA() {
        String[] args = new String[]{"-a"};
        CLParser parser = new CLParser(args);
        parser.parse();
        assertThat(parser.isAddMode()).isTrue();
    }

    @Test
    public void whenAllIsNormal() {
        String[] args = new String[]{"-s", "-a", "-p", "test_", "input.txt"};
        CLParser parser = new CLParser(args);
        parser.parse();
        assertThat(parser.inputs()).isEqualTo(List.of("input.txt"));
    }

    @Test
    public void whenNoInputFiles() {
        String[] args = new String[]{"-s", "-a", "-p", "test_"};
        CLParser parser = new CLParser(args);
        assertThat(parser.parse()).isFalse();
        assertThat(parser.description()).isEqualTo(List.of("Don't contains input files."));
    }

    @Test
    public void whenNonArgs() {
        CLParser parser = new CLParser(new String[]{});
        assertThat(parser.parse()).isFalse();
        assertThat(parser.description()).isEqualTo(List.of(
                "Don't config statistic flags -s or -f.",
                "Don't contains input files."
        ));
    }

    @Test
    public void whenNonArgsStatistic() {
        CLParser parser = new CLParser(new String[]{"in1.txt"});
        assertThat(parser.parse()).isFalse();
        assertThat(parser.description()).isEqualTo(List.of(
                "Don't config statistic flags -s or -f."
        ));
    }
}
