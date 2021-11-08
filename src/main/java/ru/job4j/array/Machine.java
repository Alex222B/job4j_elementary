package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int diff = money - price;
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        for (int elCoins : coins) {
            while (diff >= elCoins) {
                diff -= elCoins;
                rsl[size] = elCoins;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
