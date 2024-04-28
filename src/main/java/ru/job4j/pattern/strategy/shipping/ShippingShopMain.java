package ru.job4j.pattern.strategy.shipping;

public class ShippingShopMain {
    public static void main(String[] args) {
        ShippingContext context = new ShippingContext();

        context.setStrategy(new BasicShipping());
        System.out.println("Basic: " + context.calculate(1, 1, 1));

        context.setStrategy(new ExpressShipping());
        System.out.println("Express: " + context.calculate(2, 2, 2));

        context.setStrategy(new SeaShipping());
        System.out.println("Sea: " + context.calculate(3, 3, 1000));
    }
}
