package ru.job4j.enums;

enum Apple {
    Jonathan(10), GoldenDel(9), RedDel(8), Winesap(15),
    Cortland(8), Green();

    private final int price;

    Apple(int price) {
        this.price = price;
    }

    Apple() {
        this.price = 3;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        for (Apple a : Apple.values()) {
            System.out.println(a + ": " + a.getPrice());
        }

        System.out.println(Apple.valueOf("Jonathan") + ": "
                + Apple.Jonathan.getPrice());
    }
}
