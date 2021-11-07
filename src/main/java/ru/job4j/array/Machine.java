package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int diff = money - price;
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int indexCoins = 0;
        int size = 0;
        while ((diff > 0) && (indexCoins < coins.length)) {
            if (diff >= coins[indexCoins]) {
                diff -= coins[indexCoins];
                rsl[size] = coins[indexCoins];
                size++;
            } else {
                indexCoins++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
