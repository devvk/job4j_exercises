package ru.job4j.poly.instrument;

import java.util.*;

public class MusicMain {
    private static final Random RANDOM = new Random();

    public static void tune(Instrument instrument) {
        Note[] notes = Note.values();
        instrument.play(Note.values()[RANDOM.nextInt(notes.length)]);
        System.out.println(instrument.what());
        instrument.adjust();
    }

    public static void tuneAll(Instrument[] array) {
        for (Instrument instrument : array) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new WoodWind()
        };
        tuneAll(orchestra);
    }
}
