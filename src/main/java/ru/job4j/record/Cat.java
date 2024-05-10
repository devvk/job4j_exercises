package ru.job4j.record;

public record Cat(String name, int numberOfLives, String color) {
    public Cat(String name) {
        this(name, 3, "mixed");
    }

    public boolean isAlive() {
        return numberOfLives > 0;
    }
}

class Test {
    public static void main(String[] args) {
        Cat c1 = new Cat("Miv", 3, "white");
        Cat c2 = new Cat("Lulu", 3, "black");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c2.isAlive());
        System.out.println(new Cat("Murmur"));
    }
}
