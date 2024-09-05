package ru.job4j.comparator;

import java.util.Comparator;

public class ThenComparingMethod {

    public record User(String name, int age) implements Comparable<User> {

        @Override
        public int compareTo(User o) {
            return name.compareTo(o.name);
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

    public static Comparator<User> thenComparing() {
        return ascByName().thenComparing(descByAge());
    }

    public static Comparator<User> ascByName() {
        return Comparator.comparing(User::name);
    }

    public static Comparator<User> descByAge() {
        return (o1, o2) -> Integer.compare(o2.age(), o1.age());
    }

}
