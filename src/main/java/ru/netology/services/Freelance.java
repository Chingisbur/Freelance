package ru.netology.services;

public class Freelance {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int relaxMonth = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                relaxMonth++;
            } else {
                money += income;
                money -= expenses;
            }
        }
        return relaxMonth;
    }
}
