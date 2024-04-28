package ru.job4j.pattern.decorator.coffee;

public class MilkDecorator implements Coffee {
    private final Coffee coffee;

    public MilkDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 0.5;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + " + milk";
    }
}
