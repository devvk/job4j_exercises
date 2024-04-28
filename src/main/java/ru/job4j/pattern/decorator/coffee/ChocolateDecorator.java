package ru.job4j.pattern.decorator.coffee;

public class ChocolateDecorator implements Coffee {
    private final Coffee coffee;

    public ChocolateDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.0;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + " + chocolate";
    }
}
