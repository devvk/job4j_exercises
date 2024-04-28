package ru.job4j.pattern.decorator.coffee;

public class SimpleCoffee implements Coffee {
    @Override
    public double getCost() {
        return 1.0;
    }

    @Override
    public String getDesc() {
        return "SimpleCoffee";
    }
}
