package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        percent = percent / 100;
        do {
             amount += amount * percent - salary;
             year++;
        } while (amount > 0);
        return year;
    }
}
