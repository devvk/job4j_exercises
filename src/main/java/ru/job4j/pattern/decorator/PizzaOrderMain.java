package ru.job4j.pattern.decorator;

public class PizzaOrderMain {
    public static void main(String[] args) {
        Pizza basic = new BasicPizza();
        System.out.println(basic.getDescription() + ": " + basic.getCost());

        Pizza p1 = new CheeseDecorator(new PepperoniDecorator(basic));
        System.out.println(p1.getDescription() + ": " + p1.getCost());

        Pizza p2 = new MushroomDecorator(new CheeseDecorator(basic));
        System.out.println(p2.getDescription() + ": " + p2.getCost());

        Pizza p3 = new CheeseDecorator(new CheeseDecorator(basic));
        System.out.println(p3.getDescription() + ": " + p3.getCost());

        Pizza p4 = new CheeseDecorator(new PepperoniDecorator(new MushroomDecorator(basic)));
        System.out.println(p4.getDescription() + ": " + p4.getCost());
    }
}
