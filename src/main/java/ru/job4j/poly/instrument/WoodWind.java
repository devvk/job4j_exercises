package ru.job4j.poly.instrument;

public class WoodWind extends Wind {
    @Override
    public void play(Note note) {
        System.out.println("WoodWind play() " + note);
    }

    @Override
    public String what() {
        return "WoodWind";
    }
}
