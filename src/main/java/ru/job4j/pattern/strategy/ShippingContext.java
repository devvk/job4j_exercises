package ru.job4j.pattern.strategy;

public class ShippingContext {

    private ShippingStrategy strategy;

    public void setStrategy(ShippingStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double weight, double volume, double distance) {
        return strategy.calculateShippingCost(weight, volume, distance);
    }
}
