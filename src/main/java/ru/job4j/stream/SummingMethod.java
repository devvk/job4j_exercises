package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SummingMethod {

    public record User(String name, List<Bill> bills) {
    }

    public record Bill(int balance) {
    }

    public static Map<String, Integer> summing(List<User> users) {
        return users.stream()
                .collect(Collectors.groupingBy(
                        User::name,
                        Collectors.summingInt(user -> user.bills.stream()
                                .mapToInt(Bill::balance)
                                .sum())
                ));
    }
}
