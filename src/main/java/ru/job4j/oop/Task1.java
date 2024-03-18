package ru.job4j.oop;

class Tea {
    void prepare() {
        System.out.println("I would like to drink a cup of tea.");
    }
}

public class Task1 {
    public static void main(String[] args) {
        Tea t1 = new Tea();
        t1.prepare();
    }
}
