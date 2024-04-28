package ru.job4j.pattern.strategy.shipping;

public class BasicShipping implements ShippingStrategy {
    @Override
    public double calculateShippingCost(double weight, double volume, double distance) {
        return weight * COST_WEIGHT;
    }
}
