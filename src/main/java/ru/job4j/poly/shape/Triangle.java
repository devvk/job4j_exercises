package ru.job4j.poly.shape;

public class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle draw()");
    }

    @Override
    void erase() {
        System.out.println("Triangle erase()");
    }
}
