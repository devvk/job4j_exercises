package ru.job4j.loop;

public class Task80 {
    public static void loop(int[] grades) {
        double goodAvg = 0;
        double badAvg = 0;
        int sumGood = 0;
        int sumBad = 0;
        int good = 0;
        int bad = 0;
        for (int grade : grades) {
            if (grade > 2) {
                sumGood += grade;
                good++;
            } else {
                sumBad += grade;
                bad++;
            }
        }
        if (good > 0) {
            goodAvg = (double) sumGood / good;
        }
        if (bad > 0) {
            badAvg = (double) sumBad / bad;
        }
        System.out.printf("Средняя удовл. оценка: %s, средняя неуд. оценка: %s%n", goodAvg, badAvg);
    }
}
