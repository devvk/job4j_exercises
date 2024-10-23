package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountingMethod {

    public record Company(String name) {

    }

    public record Worker(int age, Company company) {

    }

    public static Map<String, Long> groupAndCount(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        worker -> worker.company().name(),
                        Collectors.counting()
                ));
    }
}
