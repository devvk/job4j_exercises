package ru.job4j.poly.instrument;

public class Percussion extends Instrument {
    @Override
    public void play(Note note) {
        System.out.println("Percussion play() " + note);
    }

    @Override
    public String what() {
        return "Percussion";
    }

    @Override
    public void adjust() {
        System.out.println("Adjusting Percussion");
    }
}
