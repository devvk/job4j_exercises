package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AveragingMethod {

    public record Company(String name) {

    }

    public record Worker(int age, Company company) {
    }

    public static Map<String, Double> averaging(List<Worker> workers) {
        return workers.stream()
                .collect(Collectors.groupingBy(
                        worker -> worker.company().name(),
                        Collectors.averagingDouble(Worker::age)
                ));
    }
}
