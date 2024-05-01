package ru.job4j.pattern.factory;

public class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("IX:VII");
    }
}
