package ru.job4j.poly.shape;

public class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Circle draw()");
    }

    @Override
    void erase() {
        System.out.println("Circle erase()");
    }
}
