package ru.job4j.pattern.decorator.coffee;

public class CoffeeHouseMain {
    public static void main(String[] args) {
        Coffee simple = new SimpleCoffee();
        System.out.println(simple.getDesc() + ": " + simple.getCost());

        Coffee c1 = new ChocolateDecorator(new MilkDecorator(new SugarDecorator(simple)));
        System.out.println(c1.getDesc() + ": " + c1.getCost());

        Coffee c2 = new MilkDecorator(new SugarDecorator(simple));
        System.out.println(c2.getDesc() + ": " + c2.getCost());

        Coffee c3 = new SugarDecorator(simple);
        System.out.println(c3.getDesc() + ": " + c3.getCost());
    }
}
