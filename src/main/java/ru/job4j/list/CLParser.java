package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class CLParser {

    /**
     * Массив параметров.
     */
    private final String[] args;

    /**
     * -o: Указывает путь к выходному файлу. Например, -o /some/path.
     */
    private boolean hasOutputPath;

    /**
     * Путь к выходному файлу.
     */
    private String outputPath;

    /**
     * -p: Указывает префикс для имён файлов. Например, -p log_.
     */
    private boolean hasPrefix;

    /**
     * Префикс для имён файлов.
     */
    private String prefix;

    /**
     * -s: Указывает, что требуется короткая статистика.
     */
    private boolean shortStatistic;

    /**
     * -f: Указывает, что требуется полная статистика.
     */
    private boolean fullStatistic;

    /**
     * -a: Включает режим добавления.
     */
    private boolean addMode;

    private final List<String> inputs = new ArrayList<>();

    private final List<String> description = new ArrayList<>();

    public CLParser(String[] args) {
        this.args = args;
    }

    public boolean parse() {
        for (int i = 0; i < args.length; i++) {
            String arg = args[i];
            switch (arg) {
                case "-o":
                    if (i + 1 < args.length) {
                        outputPath = args[++i];
                        hasOutputPath = true;
                    } else {
                        description.add("No output path specified.");
                    }
                    break;
                case "-p":
                    if (i + 1 < args.length) {
                        prefix = args[++i];
                        hasPrefix = true;
                    } else {
                        description.add("No prefix specified.");
                    }
                    break;
                case "-s":
                    shortStatistic = true;
                    break;
                case "-f":
                    fullStatistic = true;
                    break;
                case "-a":
                    addMode = true;
                    break;
                default:
                    if (!arg.startsWith("-")) {
                        inputs.add(arg);
                    } else {
                        description.add("Unknown argument: " + arg);
                    }
                    break;
            }
        }
        if (!shortStatistic && !fullStatistic) {
            description.add("Don't config statistic flags -s or -f.");
        }
        if (inputs.isEmpty()) {
            description.add("Don't contains input files.");
        }
        return description.isEmpty();
    }

    public List<String> inputs() {
        return inputs;
    }

    public String prefix() {
        return prefix;
    }

    public boolean isAddMode() {
        return addMode;
    }

    public boolean hasOutputPath() {
        return hasOutputPath;
    }

    public String outputPath() {
        return outputPath;
    }

    public boolean hasPrefix() {
        return hasPrefix;
    }

    public boolean isShortStatistic() {
        return shortStatistic;
    }

    public List<String> description() {
        return description;
    }

    public boolean isFullStatistic() {
        return fullStatistic;
    }
}
