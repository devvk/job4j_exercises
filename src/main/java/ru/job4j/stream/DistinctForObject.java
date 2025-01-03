package ru.job4j.stream;

import java.util.List;
import java.util.Objects;

public class DistinctForObject {

    public static class User {
        private final String name;
        private final int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return age == user.age && Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }

    public static List<User> distinct(List<User> users) {
        return users.stream()
                .distinct()
                .toList();
    }
}
