package ru.job4j.loop;

public class Task150 {
    public static void loop(int overdraft, int account, int[] transfers) {
        int counter = 0;
        int rest = 0;
        for (int amount : transfers) {
            if (amount > 0) {
                account += amount;
            } else if (amount < 0 && account - amount
                    >= (account + Math.abs(overdraft))) {
                account -= amount;
            } else if ((amount < 0 && account - amount
                    < (account + Math.abs(overdraft)))
                    || amount == 0) {
                break;
            }
            counter++;
        }
        System.out.printf("Остаток: %d, операций: %d%n", rest, counter);
    }
}
