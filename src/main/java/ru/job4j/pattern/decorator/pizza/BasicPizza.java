package ru.job4j.pattern.decorator.pizza;

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
