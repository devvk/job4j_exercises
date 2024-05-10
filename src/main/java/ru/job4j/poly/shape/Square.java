package ru.job4j.poly.shape;

public class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Square draw()");
    }

    @Override
    void erase() {
        System.out.println("Square erase()");
    }
}
