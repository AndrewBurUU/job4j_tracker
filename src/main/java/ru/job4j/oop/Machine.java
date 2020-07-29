package ru.job4j.oop;

import java.util.Arrays;

public class Machine {
    private final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        money = money - price;
        for (int indexCoin = 0; indexCoin < COINS.length; indexCoin++) {
             while (money - COINS[indexCoin] >= 0) {
                 rsl[size] = COINS[indexCoin];
                 size++;
                 money = money - COINS[indexCoin];
             }
        }
        return Arrays.copyOf(rsl, size);
    }
}
