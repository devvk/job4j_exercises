package ru.job4j.set;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class UniqueName {

    /**
     * Метод для подсчёта уникальных имен пользователей в списке.
     *
     * @param users Список пользователей.
     * @return Количество уникальных имен.
     */
    public static int collectUniqueName(List<User> users) {
        Set<String> uniqueNames = new HashSet<>();
        for (User user : users) {
            uniqueNames.add(user.getName());
        }
        return uniqueNames.size();
    }

    public static class User {
        private final int id;
        private final String name;

        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public String getName() {
            return name;
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
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}
