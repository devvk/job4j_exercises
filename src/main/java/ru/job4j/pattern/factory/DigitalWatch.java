package ru.job4j.pattern.factory;

import java.time.*;

public class DigitalWatch implements Watch {
    @Override
    public void showTime() {
        System.out.println(LocalTime.now());
    }
}
