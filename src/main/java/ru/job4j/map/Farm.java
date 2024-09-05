package ru.job4j.map;

import java.util.Map;
import java.util.Objects;

public class Farm {
    public static int sumLegs(Map<Animal, Integer> data) {
        int sum = 0;
        for (Map.Entry<Animal, Integer> entry : data.entrySet()) {
            Animal animal = entry.getKey();
            sum += entry.getValue() * animal.legs();
        }
        return sum;
    }

    public record Animal(String name, int legs) {

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Animal animal = (Animal) o;
            return Objects.equals(name, animal.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }
    }
}