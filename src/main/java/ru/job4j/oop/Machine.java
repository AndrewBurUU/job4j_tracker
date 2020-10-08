package ru.job4j.oop;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        money = money - price;
        for (int indexCoin = 0; indexCoin < coins.length; indexCoin++) {
             while (money - coins[indexCoin] >= 0) {
                 rsl[size] = coins[indexCoin];
                 size++;
                 money = money - coins[indexCoin];
             }
        }
        return Arrays.copyOf(rsl, size);
    }
}
