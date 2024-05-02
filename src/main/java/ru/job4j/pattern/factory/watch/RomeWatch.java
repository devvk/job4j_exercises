package ru.job4j.pattern.factory.watch;

public class RomeWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println("IX:VII");
    }
}
