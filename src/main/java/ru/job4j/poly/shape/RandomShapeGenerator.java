package ru.job4j.poly.shape;

import java.util.*;

public class RandomShapeGenerator {
    private final Random r = new Random();

    public Shape next() {
        return switch (r.nextInt(3)) {
            case 0 -> new Circle();
            case 1 -> new Square();
            case 2 -> new Triangle();
            default -> throw new IllegalArgumentException("IllegalArgumentException in switch.");
        };
    }
}
