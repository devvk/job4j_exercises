package ru.job4j.map;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Merge {
    public static Map<Integer, String> collectData(Map<Integer, String> names, List<User> users) {
        for (User user : users) {
            int userId = user.id();
            String userName = user.name();
            names.putIfAbsent(userId, userName);
            names.merge(userId, userName,
                    (oldValue, newValue) -> oldValue + " " + user.surname()
            );
        }
        return names;
    }

    public record User(int id, String name, String surname) {
        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            User user = (User) o;
            return id == user.id;
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);
        }
    }
}
