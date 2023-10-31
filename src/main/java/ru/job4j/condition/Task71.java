package ru.job4j.condition;

public class Task71 {
    public static void change(int money) {
        int rubel100 = 0;
        int rubel50 = 0;
        int rubel10 = 0;

        while (money >= 10) {
            if (money >= 100) {
                money -= 100;
                rubel100++;
            } else if (money >= 50) {
                money -= 50;
                rubel50++;
            } else {
                money -= 10;
                rubel10++;
            }
        }

        if (money == 0) {
            System.out.println("100: " + rubel100 + ", 50: " + rubel50 + ", 10: " + rubel10);
        } else {
            System.out.println("Нельзя");
        }
    }
}
