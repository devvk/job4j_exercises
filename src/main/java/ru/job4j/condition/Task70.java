package ru.job4j.condition;

public class Task70 {
    public static void secondsToMinutes(int seconds) {
        if (seconds > 3600) {
            System.out.println("Расчет не производится");
        } else {
            System.out.println("Минут: " + seconds / 60 + ", секунд: " + seconds % 60);
        }
    }
}
