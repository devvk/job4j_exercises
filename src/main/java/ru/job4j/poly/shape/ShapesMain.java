package ru.job4j.poly.shape;

public class ShapesMain {

    private static final RandomShapeGenerator GENERATOR = new RandomShapeGenerator();

    public static void main(String[] args) {
        Shape[] array = new Shape[9];

        for (int i = 0; i < array.length; i++) {
            array[i] = GENERATOR.next();
        }

        for (Shape s : array) {
            s.draw();
            s.erase();
        }
    }
}
