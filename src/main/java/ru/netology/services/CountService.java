package ru.netology.services;

public class CountService {
    public int calculate(int incom, int expense, int threshold) {
        int count = 0; // счетчик месяцев отдыха в году
        int money = 0; // колчество денег на счету

        for (int month = 0; month < 12; month++) {

            if (money >= threshold) {
                count++;
                money = (money - expense) / 3;
            } else {
                money = money + incom - expense;
            }

        }
        return count;
    }
}
