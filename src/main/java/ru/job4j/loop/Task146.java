package ru.job4j.loop;

public class Task146 {
    public static void loop(int[] nums) {
        int weight = 0;
        int people = 0;
        String msg = "Нет";
        for (int num : nums) {
            if (weight + num > 300 && people + 1 > 4) {
                msg = "Много людей и перегруз";
                break;
            } else if (weight + num > 300) {
                msg = "Перегруз";
                break;
            } else if (people + 1 > 4) {
                msg = "Много людей";
                break;
            }
            weight += num;
            people++;
        }
        System.out.printf("Людей: %d, вес: %d, отказ: %s%n", people, weight, msg);
    }
}
