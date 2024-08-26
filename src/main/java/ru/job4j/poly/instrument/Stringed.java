package ru.job4j.poly.instrument;

public class Stringed extends Instrument {
    @Override
    public void play(Note n) {
        System.out.println("Stringed play() " + Note.MIDDLE_C);
    }

    @Override
    public String what() {
        return "Stringed";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Stringed");
    }
}
