package ru.job4j.loop;

public class Task150 {
    public static void loop(int overdraft, int account, int[] transfers) {
        int operations = 0;
        for (int transfer : transfers) {
            if (transfer == 0) {
                break;
            }
            if (account + transfer < overdraft) {
                break;
            }
            account += transfer;
            operations++;
        }
        System.out.printf("Остаток: %d, операций: %d%n", account, operations);
    }
}
