package ru.job4j.loop;

public class Task148 {
    public static void loop(int children, int adults, int[] cNum, int[] aNum) {
        int groups = 0;
        int childrenOnBoard = 0;
        int adultsOnBoard = 0;
        for (int i = 0; i < cNum.length; i++) {
            if (children - cNum[i] >= 0 && adults - aNum[i] >= 0) {
                children -= cNum[i];
                childrenOnBoard += cNum[i];
                adults -= aNum[i];
                adultsOnBoard += aNum[i];
                groups++;
            }
        }
        System.out.printf("Группы: %d, Взрослых: %d, детей: %d, "
                        + "осталось билетов взр: %d, осталось билетов дет: %d%n",
                groups, adultsOnBoard, childrenOnBoard, adults, children);
    }
}
