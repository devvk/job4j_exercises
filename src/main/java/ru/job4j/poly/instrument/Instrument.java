package ru.job4j.poly.instrument;

public abstract class Instrument {
    abstract void play(Note n);

    abstract String what();

    abstract void adjust();
}
