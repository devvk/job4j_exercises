package ru.job4j.pattern.decorator.pizza;

public class MushroomDecorator implements Pizza {
    private final Pizza pizza;

    public MushroomDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + mushroom";
    }
}
