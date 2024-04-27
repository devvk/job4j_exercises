package ru.job4j.pattern.decorator;

public class PepperoniDecorator implements Pizza {
    private final Pizza pizza;

    public PepperoniDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + pepperoni";
    }
}
