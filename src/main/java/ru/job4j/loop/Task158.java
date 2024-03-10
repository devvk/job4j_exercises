package ru.job4j.loop;

public class Task158 {
    public static void loop(int num) {
        boolean result = false;
        for (int i = 2; i < Math.sqrt(num); i++) {
            for (int j = 2; j < Math.sqrt(num); j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) == num) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        System.out.println(result ? "Да" : "Нет");
    }
}
