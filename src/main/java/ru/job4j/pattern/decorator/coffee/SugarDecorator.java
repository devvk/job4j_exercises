package ru.job4j.pattern.decorator.coffee;

public class SugarDecorator implements Coffee {
    private final Coffee coffee;

    public SugarDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.1;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + " + sugar";
    }
}
