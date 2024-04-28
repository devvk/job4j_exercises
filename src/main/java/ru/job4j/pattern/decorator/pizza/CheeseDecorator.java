package ru.job4j.pattern.decorator.pizza;

public class CheeseDecorator implements Pizza {
    private final Pizza pizza;

    public CheeseDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + cheese";
    }
}
