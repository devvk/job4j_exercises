package ru.job4j.loop;

public class Task95 {
    public static void loop(int[] math, int[] info) {
        int enrolled = 0;
        int mathCount = 0;
        int itCount = 0;
        for (int i = 0; i < math.length; i++) {
            if ((math[i] + info[i]) / 2 >= 7) {
                enrolled++;
                if (math[i] > info[i]) {
                    mathCount++;
                } else {
                    itCount++;
                }
            }
        }
        System.out.printf("Зачислено: %d, ФМ: %d, ФИ: %d%n", enrolled, mathCount, itCount);
    }
}
