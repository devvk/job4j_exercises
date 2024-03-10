package ru.job4j.loop;

import java.util.StringJoiner;

public class Task167 {
    public static void loop(int[] first, int[] second, int[] third) {
        int[][] grades = {first, second, third};
        double maxAvg = 0;
        int count = 0;
        for (int[] studentGrades : grades) {
            printGrades(studentGrades);
            double avgGrade = getAvgGrade(studentGrades);
            if (avgGrade > maxAvg) {
                maxAvg = avgGrade;
            }
            if (avgGrade > 4.5) {
                count++;
            }
        }
        System.out.printf("Выше 4.5: %d, наивысшая: %s%n", count, maxAvg);
    }

    private static void printGrades(int[] grades) {
        StringJoiner sj = new StringJoiner(" ");
        for (int grade : grades) {
            sj.add(String.valueOf(grade));
        }
        System.out.printf("Оценки: %s, средняя: %s%n", sj, getAvgGrade(grades));
    }

    private static double getAvgGrade(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
