package ru.job4j.pattern.strategy;

public class SeaShipping implements ShippingStrategy {

    @Override
    public double calculateShippingCost(double weight, double volume, double distance) {
        return weight * COST_WEIGHT + volume * COST_VOLUME + 10 + distance * COST_DISTANCE;
    }
}
