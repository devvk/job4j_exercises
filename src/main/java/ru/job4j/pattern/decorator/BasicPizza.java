package ru.job4j.pattern.decorator;

public class BasicPizza implements Pizza {
    @Override
    public double getCost() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "BasicPizza";
    }
}
