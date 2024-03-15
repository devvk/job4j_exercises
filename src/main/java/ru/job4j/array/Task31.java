package ru.job4j.array;

public class Task31 {
    public static int whoWin(int[] players) {
        int result = 0;
        int pointsTeam1 = 0;
        int pointsTeam2 = 0;
        for (int i = 0; i < players.length; i++) {
            if (i % 2 == 0) {
                pointsTeam1 += players[i];
            } else {
                pointsTeam2 += players[i];
            }
        }
        if (pointsTeam1 != pointsTeam2) {
            result = pointsTeam1 > pointsTeam2 ? 1 : 2;
        }
        return result;
    }
}
