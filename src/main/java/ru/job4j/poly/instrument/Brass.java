package ru.job4j.poly.instrument;

public class Brass extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("Brass play() " + note);
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Brass");
    }
}
